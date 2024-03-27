package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 商品图片表
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_product_images")
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