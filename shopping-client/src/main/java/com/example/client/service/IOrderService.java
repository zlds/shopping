package com.example.client.service;

import com.example.client.common.Result;
import com.example.client.vo.OrderListReq;
import com.example.client.vo.OrderListResp;
import com.example.client.vo.OrderReq;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 订单接口
 */

public interface IOrderService {

	/**
	 * 查询订单
	 */
	Result<List<OrderListResp>> queryOrder(OrderListReq req);

	/**
	 * 创建订单
	 */
	Result<Void> createOrder(OrderReq req);



}
