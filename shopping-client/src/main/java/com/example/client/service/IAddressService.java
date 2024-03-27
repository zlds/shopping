package com.example.client.service;

import com.example.client.common.Result;
import com.example.client.vo.AddressListResp;
import com.example.client.vo.AddressReq;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description: 地址接口
 */

public interface IAddressService {

	/**
	 * 新增地址
	 */
	Result<Void> addAddress(AddressReq req);

	/**
	 * 删除地址
	 */
	Result<Void> deleteAddress(String id);

	/**
	 * 查询地址
	 */
	Result<List<AddressListResp>> queryAddress(String userId);
}
