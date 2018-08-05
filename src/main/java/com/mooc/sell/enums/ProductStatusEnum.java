package com.mooc.sell.enums;

import lombok.Getter;

/**
 * @Description：
 * @Auther： Administrator
 * @date： 2018/8/1:20:41
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
