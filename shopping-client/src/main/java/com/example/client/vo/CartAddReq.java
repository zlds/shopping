package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Data
public class CartAddReq {


	/**
	 * 商品id
	 */
	private String productId;

	/**
	 * 商品数量
	 */
	private Integer productNum;

}
