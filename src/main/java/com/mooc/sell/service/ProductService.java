package com.mooc.sell.service;

import com.mooc.sell.dataobject.ProductInfo;
import com.mooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Description：
 * @Auther： Administrator
 * @date： 2018/8/1:20:35
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaseStock(List<CartDTO> cartDTOList);

    // 减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    // 上架
    ProductInfo onSale(String productId);

    // 下架
    ProductInfo offSale(String productId);
}
