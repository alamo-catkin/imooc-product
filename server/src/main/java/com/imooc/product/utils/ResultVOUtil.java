package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * Created by Catkin
 * 2020-06-25 10:19
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
