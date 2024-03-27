package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/19
 * @description:
 */
@Data
public class OrderReq {


	/**
	 * 商品id
	 */
	private String productId;

	/**
	 * 商品数量
	 */
	private Integer num;

	/**
	 * 商品金额
	 */
	private Long amount;

	private String productName;

	private String productImg;


	private Integer maxNum;

	private boolean check;



}
