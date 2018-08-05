package com.mooc.sell.dto;

import lombok.Data;

/**
 * @Description: 购物车
 * @Author: LiBo
 * @Date: 2018/8/5下午 05:54
 */
@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
