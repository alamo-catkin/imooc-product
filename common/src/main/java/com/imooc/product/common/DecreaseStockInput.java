package com.imooc.product.common;

import lombok.Data;

/**
 * 减库存入参对象
 * Created by Catkin
 * 2020-06-26 16:12
 */
@Data
public class DecreaseStockInput {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
