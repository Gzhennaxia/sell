package com.mooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mooc.sell.dataobject.OrderDetail;
import com.mooc.sell.enums.OrderStatusEnum;
import com.mooc.sell.enums.PayStatusEnum;
import com.mooc.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/5下午 04:04
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL) // 已废弃的方式
//@JsonInclude(JsonInclude.Include.NON_NULL) // 替代方式
public class OrderDTO {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家手机号
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信Openid
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态，默认0为新下单
     */
    private Integer orderStatus;

    /**
     * 支付状态，默认0为未支付
     */
    private Integer payStatus;

    /**
     * 创建之间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
