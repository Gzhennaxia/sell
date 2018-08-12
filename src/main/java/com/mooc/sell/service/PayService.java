package com.mooc.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.mooc.sell.dto.OrderDTO; /**
 * @Description: 支付
 * @Author: LiBo
 * @Date: 2018/8/12下午 12:15
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
