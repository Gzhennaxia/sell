package com.mooc.sell.constant;

/**
 * @Description： redis常量
 * @Auther： libo
 * @date： 2018/8/21:16:32
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; // 两小时
}
