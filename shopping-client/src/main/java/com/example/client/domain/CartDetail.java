package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 购物车明细表
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_cart_detail")
@Data
public class CartDetail extends Base {
    /**
     * 主键
     */
    private String id;

    /**
     * 关联购物车ID
     */
    private String cartId;

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 单价
     */
    private Long price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 金额
     */
    private Long totalAmount;



}