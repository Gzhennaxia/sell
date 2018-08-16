package com.mooc.sell.repository;

import com.mooc.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/16下午 11:28
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String openid);
}
