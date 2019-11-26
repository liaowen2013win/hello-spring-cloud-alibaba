/**
 * @(#)EchoServiceFallback.java, 2019/11/26. 21:18
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.spring.cloud.alibaba.consumer.service.fallback;

import org.springframework.stereotype.Component;

import com.funtl.spring.cloud.alibaba.consumer.service.EchoService;

/**
 * @Author: L.Wen
 * @created_at: 2019/11/26 21:18
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "你的网络有问题";
    }

    @Override
    public String lb() {
        return "请联系管理员";
    }
}
