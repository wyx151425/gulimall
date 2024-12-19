package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangzhenqi
 * @email wyx151425@163.com
 * @date 2024-12-19 22:28:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
