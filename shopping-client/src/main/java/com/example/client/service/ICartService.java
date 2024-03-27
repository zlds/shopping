package com.example.client.service;

import com.example.client.common.Result;
import com.example.client.vo.CartListResp;
import com.example.client.vo.CartReq;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 购物车接口
 */

public interface ICartService {

	/**
	 * 新增购物车
	 */
	Result<Void> addCart(CartReq req);

	/**
	 * 删除购物车
	 */
	Result<Void> deleteCart(String id);

	/**
	 * 查询购物车
	 */
	Result<List<CartListResp>> queryCart(String userId);
}
