package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 评价表
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_reviews")
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