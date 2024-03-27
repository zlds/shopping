package com.example.client.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 实体类基类
 */
@Data
public abstract class Base {


	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 删除标志
	 */
	private Integer deleteFlag;

}
