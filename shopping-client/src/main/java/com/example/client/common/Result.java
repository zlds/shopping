package com.example.client.common;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */

public class Result<T> implements Serializable  {

	private static final long serialVersionUID = 1212028403568847178L;

	private int code;
	private String msg;
	private PageInfo pageInfo;
	private T data;

	private Result() {

	}

	private Result(int code) {
		this.code = code;
	}

	private Result(int code, T data) {
		this.code = code;
		this.data = data;
	}

	private Result(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	private Result(T data, PageInfo pageInfo) {
		this.code = ResultCode.OK.getCode();
		this.data = data;
		this.pageInfo = pageInfo;
	}

	private Result(String msg, T data, PageInfo pageInfo) {
		this.code = ResultCode.OK.getCode();
		this.msg = msg;
		this.data = data;
		this.pageInfo = pageInfo;
	}

	private Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private Result(String msg, T data) {
		this.code = ResultCode.OK.getCode();
		this.data = data;
		this.msg = msg;
	}

	public String getMsg() {
		return StrUtil.isNotBlank(this.msg) ? this.msg : "操作成功";
	}

	@JsonIgnore
	public boolean isSuccess() {
		return this.code == ResultCode.OK.getCode();
	}

	public static <T> Result<T> createBySuccess() {
		return new Result<>(ResultCode.OK.getCode());
	}

	public static <T> Result<T> createBySuccess(String msg) {
		return new Result<>(ResultCode.OK.getCode(), msg);
	}

	public static <T> Result<T> createBySuccess(T data) {
		return new Result<>(ResultCode.OK.getCode(), data);
	}

	public static <T> Result<T> createBySuccess(String msg, T data) {
		return new Result<>(ResultCode.OK.getCode(), msg, data);
	}

	public static <T> Result<T> createByError() {
		return new Result<>(ResultCode.INTERNAL_ERROR.getCode(), ResultCode.INTERNAL_ERROR.getMsg());
	}

	public static <T> Result<T> createByError(String errMsg) {
		return new Result<>(ResultCode.INTERNAL_ERROR.getCode(), errMsg);
	}

	public static <T> Result<T> createByError(int errCode, String errMsg) {
		return new Result<>(errCode, errMsg);
	}

	public static <T> Result<T> createByError(String errMsg, T data) {
		return new Result<>(ResultCode.INTERNAL_ERROR.getCode(), errMsg, data);
	}

	public static <T> Result<T> createByError(int errCode, String errMsg, T data) {
		return new Result<>(errCode, errMsg, data);
	}

	public static <T> Result<T> createByError(ResultCode code) {
		return new Result<>(code.getCode(), code.getMsg());
	}
	public static <T> Result<T> createByError(ResultCode code, String message) {
		return new Result<>(code.getCode(), message);
	}

	public static <T> Result<T> createByError(ResultCode code, String message, T data) {
		return new Result<>(code.getCode(), message, data);
	}

	public static <T> Result<T> createByValidated(T data) {
		return new Result<>(ResultCode.INTERNAL_ERROR.getCode(), data);
	}

	public static <T> Result<T> createBySuccessWithPages(T data, PageInfo pageInfo) {
		return new Result<>(data, pageInfo);
	}

	public static <T> Result<T> createBySuccessWithPages(String msg, T data, PageInfo pageInfo) {
		return new Result<>(msg, data, pageInfo);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
