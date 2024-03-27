package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 评价表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_reviews")
@Data
public class Review extends Base {
    /**
     * 主键ID
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
     * 审核状态：0-未审核，1-审核通过
     */
    private Integer status;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 用户ID
     */
    private String userId;


    /**
     * 评价内容
     */
    private String content;

}