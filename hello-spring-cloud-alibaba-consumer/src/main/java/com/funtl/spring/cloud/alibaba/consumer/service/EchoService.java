/**
 * @(#)EchoService.java, 2019/11/21. 14:21
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.spring.cloud.alibaba.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.funtl.spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;

/**
 * @Author: L.Wen
 * @created_at: 2019/11/21 14:21
 */
@FeignClient(value = "service-provider", fallback = EchoServiceFallback.class)
public interface EchoService {
    @GetMapping(value = "/echo/{string}")
    String echo(@PathVariable("string") String string);

    @GetMapping(value = "/lb")
    String lb();
}