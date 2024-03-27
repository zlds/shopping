package com.example.client.common;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */

public enum ResultCode {


	OK(200, null),
	NOT_FOUND(404, "请求或资源不存在"),
	INTERNAL_ERROR(500, "内部错误"),
	// 商品不存在
	PRODUCT_NOT_EXIST(1001, "商品不存在");

	private int code;
	private String msg;

	ResultCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
