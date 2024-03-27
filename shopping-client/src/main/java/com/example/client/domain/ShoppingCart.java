package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 购物车表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_shopping_carts")
@Data
public class ShoppingCart extends Base {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户ID
     */
    private String userId;

}