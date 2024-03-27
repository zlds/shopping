package com.example.web.controller;

import com.example.client.common.Result;
import com.example.client.service.ICartService;
import com.example.client.vo.CartAddReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: hanchaowei
 * @date 2024/3/27
 * @description:
 */
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private ICartService iCartService;

	/**
	 * 添加商品到购物车
	 */
	@PostMapping("/addCart/{productId}/{userId}")
	public Result addCart(@RequestBody CartAddReq req) {
		return iCartService.addCart(req);
	}


}
