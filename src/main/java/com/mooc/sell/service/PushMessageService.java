package com.mooc.sell.service;

import com.mooc.sell.dto.OrderDTO;

/**
 * @Description： 推送消息
 * @Auther： libo
 * @date： 2018/8/22:15:10
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
