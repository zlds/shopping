package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 分类表
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_category")
@Data
public class Category {

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