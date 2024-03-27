package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Data
public class CartListResp {
	/**
	 * 购物车id
	 */
	private Integer id;

	/**
	 * 商品id
	 */
	private String productId;

	/**
	 * 商品名称
	 */
	private String productName;

	/**
	 * 商品图片
	 */
	private String productImg;

	/**
	 * 商品价格
	 */
	private Long price;

	/**
	 * 商品数量
	 */
	private Integer num;

	/**
	 * 商品总价
	 */
	private Long totalPrice;

}
