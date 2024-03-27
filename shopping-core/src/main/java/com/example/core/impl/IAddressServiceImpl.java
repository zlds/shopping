package com.example.core.impl;

import cn.hutool.core.lang.UUID;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.client.common.Result;
import com.example.client.domain.Address;
import com.example.client.service.IAddressService;
import com.example.client.vo.AddressListResp;
import com.example.client.vo.AddressReq;
import com.example.core.dao.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Service
public class IAddressServiceImpl implements IAddressService {

	@Autowired
	private AddressMapper addressMapper;

	@Override
	public Result<Void> addAddress(AddressReq req) {
		if (req == null) {
			return Result.createByError("参数不能为空");
		}
		Address address = new Address();
		address.setId(UUID.randomUUID().toString());
		address.setUserId(req.getUserId());
		address.setIsDefault(req.getIsDefault());
		address.setProvince(req.getProvince());
		address.setCity(req.getCity());
		address.setLocation(req.getLocation());
		address.setReceiver(req.getReceiver());
		address.setPostCode(req.getPostCode());
		address.setMobile(req.getMobile());
		address.setArea(req.getArea());
		address.setCity(req.getCity());
		addressMapper.insert(address);
		return Result.createBySuccess();
	}

	@Override
	public Result<Void> deleteAddress(String id) {
		addressMapper.deleteById(id);
		return Result.createBySuccess();
	}

	@Override
	public Result<List<AddressListResp>> queryAddress(String userId) {
		QueryWrapper<Address> wrapper = new QueryWrapper<>();
		wrapper.eq("user_id", userId);
		List<Address> addresses = addressMapper.selectList(wrapper);
		if (CollectionUtils.isEmpty(addresses)) {
			return Result.createByError("没有收货地址");
		}
		List<AddressListResp> resultList = new ArrayList<>();
		for (Address address : addresses) {
			AddressListResp resp = new AddressListResp();
			resp.setId(address.getId());
			resp.setName(address.getReceiver());
			resp.setPhone(address.getMobile());
			resp.setAddress(address.getProvince() + " " + address.getCity() +  " " + address.getLocation());
			resultList.add(resp);
		}
		return Result.createBySuccess(resultList);
	}
}
