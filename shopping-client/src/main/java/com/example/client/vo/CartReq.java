package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Data
public class CartReq {


	/**
	 * 商品id
	 */
	private Integer productId;

	/**
	 * 商品数量
	 */
	private Integer productNum;

}
