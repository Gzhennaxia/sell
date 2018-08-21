package com.mooc.sell.enums;

import lombok.Getter;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/5下午 05:18
 */
@Getter
public enum ResultEnum {

    SUCCESS(0,"成功"),

    PARAM_ERROR(1,"参数不正确"),

    PRODUCT_NOT_EXIT(10,"商品不存在"),

    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),

    ORDER_NOT_EXIT(12,"订单不存在"),

    ORDERDETAIL_NOT_EXIT(13,"订单详情不存在"),

    ORDER_STATUS_ERROR(14,"订单状态不正确"),

    ORDER_UPDATE_FAIL(15,"订单更新失败"),

    ORDER_DETAIL_EMPTY(16,"订单详情为空"),

    ORDER_PAY_STATUS_ERROR(17,"订单支付状态不正确"),

    CART_EMPTY(18,"购物车为空"),

    ORDER_OWNER_ERROR(19,"该订单不属于当前用户"),

    WECHAT_MP_ERROR(20,"微信公众号方面错误"),

    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21,"微信支付异步通知金额验证不通过"),

    ORDER_CANCEL_SUCCESS(22,"订单取消成功"),

    ORDER_FINISH_SUCCESS(23,"订单完结成功"),

    PRODUCT_STATUS_ERROR(24,"商品状态错误"),

    LOGIN_FAIL(25,"登录失败"),

    LOGOUT_SUCCESS(26,"登出成功"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
