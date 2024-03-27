package com.example.core.impl;

import cn.hutool.core.lang.UUID;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.client.common.Result;
import com.example.client.domain.Cart;
import com.example.client.domain.CartDetail;
import com.example.client.domain.ProductImage;
import com.example.client.service.ICartService;
import com.example.client.service.IProductService;
import com.example.client.vo.CartListResp;
import com.example.client.vo.CartAddReq;
import com.example.client.vo.ProductInfoResp;
import com.example.core.common.UserContext;
import com.example.core.dao.CartDetailMapper;
import com.example.core.dao.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Service
public class ICartServiceImpl implements ICartService {

	@Autowired
	private CartMapper cartMapper;
	@Autowired
	private CartDetailMapper cartDetailMapper;
	@Autowired
	private UserContext userContext;
	@Autowired
	private IProductService iProductService;


	@Override
	@Transactional
	public Result<Void> addCart(CartAddReq req) {
		// 1、先查询根据用户id查询购物车
		String userId = userContext.getUserId();
		QueryWrapper<Cart> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("user_id", userId);
		Cart cart = cartMapper.selectOne(queryWrapper);
		if (cart == null) {
			// 新增购物车
			cart = new Cart();
			cart.setId(UUID.randomUUID().toString());
			cart.setUserId(userId);
			cartMapper.insert(cart);
			// 新增购物车详情
			addCartDetail(req, cart);
			return Result.createBySuccess();
		}

		String cartId = cart.getId();
		// 根据购物车id查询购物车详情
		QueryWrapper<CartDetail> wrapper = new QueryWrapper<>();
		wrapper.eq("cart_id", cartId);
		List<CartDetail> cartDetailList = cartDetailMapper.selectList(wrapper);
		for (CartDetail cartDetail : cartDetailList) {
			if (cartDetail.getProductId().equals(req.getProductId())) {
				// 如果购物车中已经存在该商品，则数量加1。并重新计算金额。
				cartDetail.setQuantity(cartDetail.getQuantity() + req.getProductNum());
				cartDetail.setTotalAmount(cartDetail.getPrice() * cartDetail.getQuantity());
				cartDetailMapper.updateById(cartDetail);
				return Result.createBySuccess();
			} else {
				// 添加新商品到购物车
				addCartDetail(req, cart);
			}
		}

		return Result.createBySuccess();
	}

	private void addCartDetail(CartAddReq req, Cart cart) {
		// 新增购物车详情
		CartDetail cartDetail = new CartDetail();
		cartDetail.setId(UUID.randomUUID().toString());
		cartDetail.setCartId(cart.getId());
		cartDetail.setProductId(req.getProductId());
		cartDetail.setQuantity(req.getProductNum());
		cartDetail.setCreateTime(new Date());
		cartDetail.setUpdateTime(new Date());
		// 获取商品详情
		ProductInfoResp productInfoResp = iProductService.productDetail(req.getProductId()).getData();
		cartDetail.setProductName(productInfoResp.getName());
		cartDetail.setPrice(productInfoResp.getPrice());
		cartDetail.setTotalAmount(productInfoResp.getPrice() * req.getProductNum());
		cartDetailMapper.insert(cartDetail);
	}

	@Override
	public Result<Void> deleteCart(String id) {
		return null;
	}

	@Override
	public Result<List<CartListResp>> queryCart() {
		String userId = userContext.getUserId();
		QueryWrapper<Cart> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("user_id", userId);
		Cart cart = cartMapper.selectOne(queryWrapper);
		if (cart == null) {
			return Result.createBySuccess();
		}

		String cartId = cart.getId();
		QueryWrapper<CartDetail> wrapper = new QueryWrapper<>();
		wrapper.eq("cart_id", cartId);
		List<CartDetail> cartDetailList = cartDetailMapper.selectList(wrapper);

		List<CartListResp> respList = new ArrayList<>();

		for (CartDetail cartDetail : cartDetailList) {
			CartListResp cartListResp = new CartListResp();
			cartListResp.setProductId(cartDetail.getProductId());
			cartListResp.setProductName(cartDetail.getProductName());
			cartListResp.setNum(cartDetail.getQuantity());
			cartListResp.setPrice(cartDetail.getPrice());
			cartListResp.setTotalPrice(cartDetail.getTotalAmount());
			// 商品图未完成
			respList.add(cartListResp);
		}

		return Result.createBySuccess(respList);
	}
}
