package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Catkin
 * 2020-06-25 0:00
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> result = productService.findUpAll();
        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void findList() {
        List<ProductInfoOutput> result = productService.findList(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void decreaseStock() {
        DecreaseStockInput cartDTO = new DecreaseStockInput("157875196366160022", 2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}