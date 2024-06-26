package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 订单明细表
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_order_detail")
@Data
public class OrderDetail extends Base {
    /**
     * 主键
     */
    private String id;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 商品数量
     */
    private Integer quantity;

    /**
     * 商品折扣
     */
    private Integer discount;

}