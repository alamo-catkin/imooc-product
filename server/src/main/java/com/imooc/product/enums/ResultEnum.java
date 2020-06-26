package com.imooc.product.enums;

import lombok.Getter;

/**
 * Created by Catkin
 * 2020-06-26 12:34
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "商品库存不足"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}