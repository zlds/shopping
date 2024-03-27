package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 商品表
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_products")
@Data
public class Product extends Base {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 优惠价格
     */
    private Long discountPrice;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 商品状态:1-在售,2-下架,3-删除
     */
    private Integer status;

    /**
     * 销量
     */
    private Integer salesQuantity;

    /**
     * 商品描述
     */
    private String description;

}