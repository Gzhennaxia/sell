package com.mooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Description：
 * @Auther： Administrator
 * @date： 2018/8/1:21:16
 */
@Data
public class ProductVO {

    @JsonProperty("name") // 在将对象序列化成json的时候名称改为name
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
