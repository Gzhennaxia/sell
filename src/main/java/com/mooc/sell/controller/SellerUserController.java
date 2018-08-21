package com.mooc.sell.controller;

import com.mooc.sell.dataobject.SellerInfo;
import com.mooc.sell.enums.ResultEnum;
import com.mooc.sell.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/20下午 10:57
 */
@Controller
@RequestMapping("/seller")
public class SellerUserController {

    @Autowired
    private SellerInfoService sellerInfoService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/login")
    public ModelAndView login(@RequestParam("openid") String openid,
                              Map<String, Object> map) {
        // 1. openid去和数据库里的数据匹配
        SellerInfo sellerInfo = sellerInfoService.findSellerInfoByOpenid(openid);
        if (sellerInfo == null){
            map.put("msg", ResultEnum.LOGIN_FAIL.getMessage());
            map.put("url", "/sell/seller/order/list");
            return new ModelAndView("common/error");
        }

        // 2. 设置token至redis
        redisTemplate.opsForValue().set("abc", "kasjkfddjklfdaskjl");

        // 3. 设置token至cookie
        return null;
    }
}
