package com.example.core.dao;



import com.example.client.domain.Orders;
import com.example.client.vo.OrderListResp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
* Created by Generator 2024-03-15 17:06
*/
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

	/**
	 * 根据订单状态查询订单列表
	 */
	List<OrderListResp> selectByOrderStatus(@Param("orderStatus") Integer orderStatus,@Param("userId") String userId);
}