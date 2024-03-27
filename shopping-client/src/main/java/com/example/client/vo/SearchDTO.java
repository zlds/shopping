package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/16
 * @description: 商品搜索响应DTO
 */
@Data
public class SearchDTO {

	/**
	 * 商品id
	 */
	private String id;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 商品类别
	 */
	private Integer productType;

	/**
	 * 价格
	 */
	private String price;

	/**
	 * 商品图片
	 */
	private String productImg;
}
