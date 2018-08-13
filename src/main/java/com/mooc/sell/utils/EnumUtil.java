package com.mooc.sell.utils;

import com.mooc.sell.enums.CodeEnum;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/13上午 01:34
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
