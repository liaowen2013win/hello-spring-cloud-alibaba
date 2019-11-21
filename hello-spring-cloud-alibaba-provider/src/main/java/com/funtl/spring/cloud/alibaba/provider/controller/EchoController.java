/**
 * @(#)EchoController.java, 2019/11/21. 11:16
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.spring.cloud.alibaba.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: L.Wen
 * @created_at: 2019/11/21 11:16
 */
@RestController
public class EchoController {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return "Hello Nacos Provider " + string;
    }
}


