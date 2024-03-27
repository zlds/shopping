package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/19
 * @description: 订单列表返回VO
 */
@Data
public class OrderListResp {

	/**
	 * 订单id
	 */
	private String id;

	/**
	 * 订单编号
	 */
	private String orderNo;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 商品名称
	 */
	private String productName;

	/**
	 * 商品价格
	 */
	private Long productPrice;

	/**
	 * 购买数量
	 */
	private Integer productQuantity;

	/**
	 * 金额
	 */
	private Long productAmount;

	/**
	 * 商品图片
	 */
	private String productIcon;

	/**
	 * 订单总金额
	 */
	private Long orderAmount;

	/**
	 * 订单状态
	 */
	private Integer orderStatus;

	/**
	 * 支付状态
	 */
	private Integer payStatus;


}
