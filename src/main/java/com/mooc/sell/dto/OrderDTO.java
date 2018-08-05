package com.mooc.sell.dto;

import com.mooc.sell.dataobject.OrderDetail;
import com.mooc.sell.enums.OrderStatusEnum;
import com.mooc.sell.enums.PayStatusEnum;
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
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
