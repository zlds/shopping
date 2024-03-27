package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/16
 * @description: 商品搜索请求VO
 */
@Data
public class SearchReq {

	/**
	 * 商品名称
	 */
	private String productName;

	/**
	 * 商品类别
	 */
	private String productType;

	/**
	 * 价格区间
	 */
	private String priceRange;

	/**
	 * 当前页
	 */
	private Integer currentPage;
}
