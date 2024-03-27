package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/3/19
 * @description:
 */
@Data
public class AddressListResp {

	/**
	 * id
	 */
	private String id;

	/**
	 * 收件人姓名
	 */
	private String name;

	/**
	 * 收件人电话
	 */
	private String phone;

	/**
	 * 收件人地址
	 */
	private String address;
}
