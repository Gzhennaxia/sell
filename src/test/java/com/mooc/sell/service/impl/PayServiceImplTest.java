package com.mooc.sell.service.impl;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.mooc.sell.dto.OrderDTO;
import com.mooc.sell.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/12下午 12:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PayServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayServiceImpl payService;

    @Test
    public void create() {
        OrderDTO orderDTO = orderService.findOne("1533575053817974466");
        payService.create(orderDTO);
    }

    @Test
    public void refundTest(){
        OrderDTO orderDTO = orderService.findOne("1533575053817974466");
        payService.refund(orderDTO);
    }
}