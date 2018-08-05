package com.mooc.sell.service;

import com.mooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 *
 * @Description：
 * @Auther： Administrator
 * @date： 2018/8/1:20:07
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
