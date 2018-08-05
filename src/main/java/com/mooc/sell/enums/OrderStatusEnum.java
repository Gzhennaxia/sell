package com.mooc.sell.enums;

import lombok.Getter;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/5下午 12:42
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新下单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
