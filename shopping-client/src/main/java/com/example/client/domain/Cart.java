package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 购物车表
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_cart")
@Data
public class Cart extends Base {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户ID
     */
    private String userId;

}