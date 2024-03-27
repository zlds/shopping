package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * 轮播图商品列表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_carousel_items")
@Data
public class CarouselItem extends Base {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 图片id路径
     */
    private String imageId;

    /**
     * 轮播项的标题，用于简短描述轮播的商品或促销信息
     */
    private String title;

    /**
     * 用户点击轮播项时跳转的链接，通常是商品详情页面的URL
     */
    private String url;

    /**
     * 定义轮播项的展示顺序，用于控制轮播的播放顺序
     */
    private Integer displayOrder;

    /**
     * 轮播项的状态（如“激活”、“禁用”），用于控制是否在轮播中展示该项
     */
    private Byte status;

    /**
     * 轮播项开始展示的时间
     */
    private Date startTime;

    /**
     * 轮播项结束展示的时间
     */
    private Date endTime;

    /**
     * 对轮播商品或促销活动的详细描述
     */
    private String description;

}