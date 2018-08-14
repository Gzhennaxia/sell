package com.mooc.sell.form;

import com.mooc.sell.enums.ProductStatusEnum;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/15上午 01:28
 */
@Data
public class ProductForm {

    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 单价
     */
    private BigDecimal productPrice;
    /**
     * 库存
     */
    private Integer productStock;
    /**
     * 描述
     */
    private String productDescription;
    /**
     * 小图
     */
    private String productIcon;
    /**
     * 状态，0正常1下架
     */
    private Integer productStatus = ProductStatusEnum.UP.getCode();
    /**
     * 类目编号
     */
    private Integer categoryType;
}
