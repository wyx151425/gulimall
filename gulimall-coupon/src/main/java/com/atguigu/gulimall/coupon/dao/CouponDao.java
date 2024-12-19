package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangzhenqi
 * @email wyx151425@163.com
 * @date 2024-12-19 22:16:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
