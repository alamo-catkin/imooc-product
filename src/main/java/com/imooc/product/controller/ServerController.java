package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Catkin
 * 2020-06-25 14:16
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "This is product' msg 2";
    }
}
