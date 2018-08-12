package com.mooc.sell.utils;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/12下午 01:34
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        } else {
            return false;
        }
    }
}
