package com.example.core.impl;

import com.example.client.common.PageInfo;
import com.example.client.common.Result;
import com.example.client.service.IOrderService;
import com.example.client.vo.OrderListReq;
import com.example.client.vo.OrderListResp;
import com.example.client.vo.OrderReq;
import com.example.core.dao.OrderMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Service
public class IOrderServiceImpl implements IOrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public Result<List<OrderListResp>> queryOrder(OrderListReq req) {
		String userId = "1";
		// 设置分页
		Page<Object> page = null;
		page = PageHelper.startPage(req.getCurrentPage(), 10);
		List<OrderListResp> orderListResps = orderMapper.selectByOrderStatus(req.getOrderStatus(), userId);
		if (CollectionUtils.isEmpty(orderListResps)) {
			return Result.createBySuccess(orderListResps);
		}
		return Result.createBySuccessWithPages(orderListResps,  PageInfo.create(page));
	}

	@Override
	public Result<Void> createOrder(OrderReq req) {
		return null;
	}
}
