package com.example.core.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.client.domain.Cart;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@Mapper
public interface CartMapper extends BaseMapper<Cart> {
}