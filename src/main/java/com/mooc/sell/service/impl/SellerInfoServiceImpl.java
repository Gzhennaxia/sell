package com.mooc.sell.service.impl;

import com.mooc.sell.dataobject.SellerInfo;
import com.mooc.sell.repository.SellerInfoRepository;
import com.mooc.sell.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/16下午 11:40
 */
@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
