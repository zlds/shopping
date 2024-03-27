package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/19
 * @description:
 */
@Data
public class OrderListReq {

	/**
	 * 订单状态
	 */
	private Integer orderStatus;

	/**
	 * 当前页
	 */
	private Integer currentPage;
}
