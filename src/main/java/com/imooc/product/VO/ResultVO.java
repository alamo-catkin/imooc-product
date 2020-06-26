package com.imooc.product.VO;

import lombok.Data;

/**
 * Created by Catkin
 * 2020-06-25 9:19
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
