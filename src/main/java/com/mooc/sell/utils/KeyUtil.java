package com.mooc.sell.utils;

import java.util.Random;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/5下午 04:56
 */
public class KeyUtil {

    /**
     * 创建唯一主键
     * 格式：时间+随机数
     * 注意多线程情况下为保证主键的唯一性要加锁
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        // 生成一个六位数的随机数
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
