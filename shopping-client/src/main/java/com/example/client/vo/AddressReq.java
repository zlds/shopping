package com.example.client.vo;

import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 地址请求VO
 */
@Data
public class AddressReq {

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 是否为默认地址
	 */
	private Integer isDefault;

	/**
	 * 省
	 */
	private String province;

	/**
	 * 市
	 */
	private String city;

	/**
	 * 区
	 */
	private String area;

	/**
	 * 具体地址
	 */
	private String location;

	/**
	 * 收货人
	 */
	private String receiver;

	/**
	 * 邮编
	 */
	private String postCode;

	/**
	 * 收件人手机号
	 */
	private String mobile;

	/**
	 * 状态: 0-正常,1-禁用
	 */
	private Integer status;
}
