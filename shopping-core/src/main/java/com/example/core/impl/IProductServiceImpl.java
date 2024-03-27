package com.example.core.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.client.common.PageInfo;
import com.example.client.common.Result;
import com.example.client.common.ResultCode;
import com.example.client.domain.ProductImage;
import com.example.client.service.IProductService;
import com.example.client.vo.*;
import com.example.core.dao.ProductImageMapper;
import com.example.core.dao.ProductMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Service
public class IProductServiceImpl implements IProductService {

	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private ProductImageMapper productImageMapper;
	/**
	 * 图片地址
	 */
	private final static String IMG_URL = "http://localhost:8080";

	@Override
	public Result<List<SearchResp>> searchProduct(SearchReq req) {
		List<SearchResp> respList = new ArrayList<>();
		// 设置分页
		Page<Object> page = null;
		page = PageHelper.startPage(req.getCurrentPage(), 20);
		// 查询商品
		List<SearchDTO> searchDTOS = productMapper.searchByProductName(req.getProductName());
		if (CollectionUtils.isEmpty(searchDTOS)) {
			// 如果为查询到返回空数据
			return Result.createBySuccess(respList);
		}
		// 将商品信息封装到返回对象中
		for (SearchDTO product : searchDTOS) {
			SearchResp resp = new SearchResp();
			resp.setProductId(String.valueOf(product.getId()));
			resp.setProductName(product.getName());
			resp.setProductType(product.getProductType());
			resp.setPrice(String.valueOf(product.getPrice()));
			resp.setProductImg(IMG_URL + product.getProductImg());
			respList.add(resp);
		}
		return Result.createBySuccessWithPages(respList,  PageInfo.create(page));
	}

	@Override
	public Result<ProductInfoResp> productDetail(String productId) {
		ProductInfoResp productInfoResp = productMapper.selectProductDetailById(productId);
		if (productInfoResp == null) {
			return Result.createBySuccess(ResultCode.PRODUCT_NOT_EXIST.getMsg());
		}
		productInfoResp.setProductImg(IMG_URL + productInfoResp.getProductImg());
		return Result.createBySuccess(productInfoResp);
	}

	@Override
	public Result<List<ProductImageResp>> getProductImg(String productId) {
		QueryWrapper<ProductImage> wrapper = new QueryWrapper<>();
		wrapper.eq("product_id", productId);
		List<ProductImage> productImages = productImageMapper.selectList(wrapper);
		if (CollectionUtils.isEmpty(productImages)) {
			return Result.createBySuccess(ResultCode.PRODUCT_NOT_EXIST.getMsg());
		}
		List<ProductImageResp> respList = new ArrayList<>();
		for (ProductImage productImage : productImages) {
			ProductImageResp resp = new ProductImageResp();
			resp.setProductPicture(IMG_URL + productImage.getPicPath());
			respList.add(resp);
		}

		return Result.createBySuccess(respList);
	}
}
