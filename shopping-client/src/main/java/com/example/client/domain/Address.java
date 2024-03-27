package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 用户地址表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_addresses")
@Data
public class Address extends Base {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 是否为默认地址
     */
    private Integer isDefault;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 具体地址
     */
    private String location;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 收件人手机号
     */
    private String mobile;

    /**
     * 状态: 0-正常,1-禁用
     */
    private Integer status;

}