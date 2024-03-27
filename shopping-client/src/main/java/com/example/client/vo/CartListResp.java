package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Data
public class CartListResp {
	private Integer id;

	private Integer productId;

	private String productName;

	private String productImg;

	private Double price;

	private Integer num;

}
