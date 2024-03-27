package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 订单表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_orders")
@Data
public class Orders extends Base {
    /**
     * 主键ID(订单ID)
     */
    private String id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 总金额
     */
    private Long totalAmount;

    /**
     * 实际支付金额
     */
    private Long actualPayment;

    /**
     * 支付渠道
     */
    private Integer channel;

    /**
     * 支付状态：0-待付款,1-待发货，2-待收货，3-待评价，4-已完成
     */
    private Integer payStatus;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 状态: 0-正常,1-禁用
     */
    private Integer status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getActualPayment() {
		return actualPayment;
	}

	public void setActualPayment(Long actualPayment) {
		this.actualPayment = actualPayment;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}