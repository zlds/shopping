package com.example.core.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.client.domain.Product;
import com.example.client.vo.ProductInfoResp;
import com.example.client.vo.SearchDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

	/**
	 * 根据商品名称搜索商品
	 * @param productName
	 * @return
	 */
	List<SearchDTO> searchByProductName(@Param("productName") String productName);

	/**
	 * 商品详情
	 */
	ProductInfoResp selectProductDetailById(@Param("productId") String productId);

}
