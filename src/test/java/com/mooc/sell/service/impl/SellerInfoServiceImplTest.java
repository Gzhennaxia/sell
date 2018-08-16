package com.mooc.sell.service.impl;

import com.mooc.sell.dataobject.SellerInfo;
import com.mooc.sell.service.SellerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/16下午 11:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerInfoServiceImplTest {

    private static final String OPENID = "abc";
    @Autowired
    private SellerInfoServiceImpl sellerInfoService;

    @Test
    public void findSellerInfoByOpenid() {
        SellerInfo result = sellerInfoService.findSellerInfoByOpenid(OPENID);
        Assert.assertEquals("abc", result.getOpenid() );
    }
}