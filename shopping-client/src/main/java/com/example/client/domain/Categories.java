package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 分类表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_categories")
@Data
public class Categories {

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 分类名称
	 */
	private String name;

	/**
	 * 分类父ID
	 */
	private String parentId;

	/**
	 * 分类描述
	 */
	private String description;

}