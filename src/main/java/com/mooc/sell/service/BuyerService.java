package com.mooc.sell.service;

import com.mooc.sell.dto.OrderDTO;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/7上午 01:47
 */
public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String orderId, String openid);

    // 取消一个订单
    OrderDTO cancel(String orderId, String openid);
}
