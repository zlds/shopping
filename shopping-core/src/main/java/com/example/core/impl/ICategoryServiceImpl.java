package com.example.core.impl;


import cn.hutool.core.lang.UUID;
import com.example.client.common.Result;
import com.example.client.domain.Category;
import com.example.client.service.ICategoryService;
import com.example.core.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 公告
 * @author: hanchaowei
 * @date 2023/10/15
 * @description:
 */
@Service
public class ICategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


	@Override
	public Result<Void> addCategory(Category req) {
		if (req.getId() == null ) {
			return Result.createByError("数据不能为空");
		}
		if (req.getName() != null) {
			return Result.createByError("分类名称不能为空");
		}
		req.setId(UUID.randomUUID().toString());
		categoryMapper.insert(req);
		return Result.createBySuccess();
	}

	@Override
	public Result<Void> deleteCategory(String id) {
		categoryMapper.deleteById(id);
		return Result.createBySuccess();
	}

	@Override
	public Result<List<Category>> queryCategory() {
		List<Category> categoryList = categoryMapper.selectList(null);
		if (categoryList == null) {
			return Result.createBySuccess();
		}
		return Result.createBySuccess(categoryList);
	}
}
