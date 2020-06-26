package com.imooc.product.enums;

import lombok.Getter;

/**
 * 商品状态枚举
 * Created by Catkin
 * 2020-06-24 23:55
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
