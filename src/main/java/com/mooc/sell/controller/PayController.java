package com.mooc.sell.controller;

import com.lly835.bestpay.model.PayResponse;
import com.mooc.sell.dto.OrderDTO;
import com.mooc.sell.enums.ResultEnum;
import com.mooc.sell.exception.SellException;
import com.mooc.sell.service.OrderService;
import com.mooc.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/12上午 11:43
 */
@Controller
@RequestMapping("/pay")
@Slf4j
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                       @RequestParam("returnUrl") String returnUrl,
                       Map<String, Object> map) {
        // 1. 查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO==null){
            log.error("【微信支付】订单不存在");
            throw new SellException(ResultEnum.ORDER_NOT_EXIT);
        }

        // 2. 发起支付
        PayResponse payResponse = payService.create(orderDTO);

        map.put("payResponse", payResponse);
        map.put("returnUrl", returnUrl);

        return new ModelAndView("pay/create", map);
    }

    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData){
        payService.notify(notifyData);

        // 返回给微信处理结果
        return new ModelAndView("pay/success");
    }
}
