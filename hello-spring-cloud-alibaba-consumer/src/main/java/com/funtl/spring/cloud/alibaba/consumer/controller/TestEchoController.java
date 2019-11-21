/**
 * @(#)TestEchoController.java, 2019/11/21. 14:26
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.funtl.spring.cloud.alibaba.consumer.service.EchoService;

/**
 * @Author: L.Wen
 * @created_at: 2019/11/21 14:26
 */
@RestController
public class TestEchoController {
    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable String str) {
        return echoService.echo(str);
    }
}
