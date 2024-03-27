package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 商品图片响应VO
 */
@Data
public class ProductImageResp {

	/**
	 * 商品id
	 */
	private Integer productId;

	/**
	 * 商品图片
	 */
	private String productPicture;
	/**
	 * 商品介绍
	 */
	private String intro;
}
