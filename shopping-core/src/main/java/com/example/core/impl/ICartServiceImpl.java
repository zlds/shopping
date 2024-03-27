package com.example.core.impl;

import com.example.client.common.Result;
import com.example.client.service.ICartService;
import com.example.client.vo.CartListResp;
import com.example.client.vo.CartReq;
import com.example.core.dao.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */

public class ICartServiceImpl implements ICartService {

	@Autowired
	private CartMapper cartMapper;


	@Override
	public Result<Void> addCart(CartReq req) {

		return null;
	}

	@Override
	public Result<Void> deleteCart(String id) {
		return null;
	}

	@Override
	public Result<List<CartListResp>> queryCart(String userId) {
		return null;
	}
}
