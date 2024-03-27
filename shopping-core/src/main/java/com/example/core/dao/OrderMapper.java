package com.example.core.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.client.domain.Order;
import com.example.client.vo.OrderListResp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

	/**
	 * 根据订单状态查询订单列表
	 */
	List<OrderListResp> selectByOrderStatus(@Param("orderStatus") Integer orderStatus,@Param("userId") String userId);
}