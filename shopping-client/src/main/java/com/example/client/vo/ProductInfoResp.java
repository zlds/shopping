package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/19
 * @description: 商品详情响应VO
 */
@Data
public class ProductInfoResp {

	/**
	 * 商品id
	 */
	private String id;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 商品描述
	 */
	private String description;

	/**
	 * 商品价格
	 */
	private Long price;

	/**
	 * 类别
	 */
	private Integer category;

	/**
	 * 商品库存
	 */
	private Integer stock;

	/**
	 * 商品图片
	 */
	private String productImg;

	/**
	 * 买家评论
	 */
	private String comment;
}
