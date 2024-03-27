package com.example.core.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.client.domain.CartDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Mapper
public interface CartDetailMapper extends BaseMapper<CartDetail> {

	/**
	 * 根据购物车id查询购物车详情
	 */
	List<CartDetail> selectByCartId(String cartId);
}