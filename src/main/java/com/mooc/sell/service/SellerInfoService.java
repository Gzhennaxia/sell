package com.mooc.sell.service;

import com.mooc.sell.dataobject.SellerInfo;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/16下午 11:39
 */
public interface SellerInfoService {
    SellerInfo findSellerInfoByOpenid(String openid);
}
