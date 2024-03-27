package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 商品图片表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_product_images")
@Data
public class ProductImage extends Base {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 图片路径
     */
    private String picPath;

}