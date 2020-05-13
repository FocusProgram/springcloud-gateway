package com.api.consul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author Mr.Kong
 * @date 2020-05-13 23:21
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping("info")
    public String getOrder(){
        return "order";
    }
}
