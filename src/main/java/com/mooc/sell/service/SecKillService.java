package com.mooc.sell.service;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/8/26:19:20
 */
public interface SecKillService {

    /**
     * 查询秒杀或多特价商品的信息
     * @param productId
     * @return
     */
    String querySecKillProductInfo(String productId);

    /**
     * 模拟不同用户秒杀同一商品的请求
     * @param productId
     */
    void orderProductMockDiffUser(String productId);
}
