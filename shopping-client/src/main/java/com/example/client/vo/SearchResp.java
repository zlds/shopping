package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/16
 * @description: 商品搜索响应VO
 */
@Data
public class SearchResp {

	/**
	 * 商品id
	 */
	private String productId;

	/**
	 * 商品名称
	 */
	private String productName;

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
