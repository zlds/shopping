package com.example.client.service;


import com.example.client.common.Result;
import com.example.client.vo.ProductImageResp;
import com.example.client.vo.ProductInfoResp;
import com.example.client.vo.SearchReq;
import com.example.client.vo.SearchResp;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 商品接口
 */

public interface IProductService {


	/**
	 * 商品搜索
	 * @param req
	 * @return
	 */
	Result<List<SearchResp>> searchProduct(SearchReq req);

	/**
	 * 商品详情
	 */
	Result<ProductInfoResp> productDetail(String productId);

	/**
	 * 获取商品图片
	 */
	Result<List<ProductImageResp>> getProductImg(String productId);

}
