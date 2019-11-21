/**
 * @(#)TestEchoController.java, 2019/11/21. 14:26
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.funtl.spring.cloud.alibaba.consumer.service.EchoService;

/**
 * @Author: L.Wen
 * @created_at: 2019/11/21 14:26
 */
@RefreshScope
@RestController
public class TestEchoController {
    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    /**
     * 测试FeignClient
     *
     * @param str
     * @return
     */
    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable String str) {
        return echoService.echo(str);
    }

    /**
     * 测试负载均衡
     *
     * @return
     */
    @GetMapping(value = "/lb")
    public String lb() {
        return echoService.lb();
    }

    /**
     * 测试动态配置
     *
     * @return
     */
    @GetMapping(value = "/config")
    public String config() {
        return echoService.echo(username);
    }

}
