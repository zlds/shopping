package com.example.client.service;

import com.example.client.common.Result;
import com.example.client.domain.Category;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 分类接口
 */

public interface ICategoryService {

	/**
	 * 新增分类
	 */
	Result<Void> addCategory(Category req);

	/**
	 * 删除分类
	 */
	Result<Void> deleteCategory(String id);

	/**
	 * 查询分类
	 */
	Result<List<Category>> queryCategory();

}
