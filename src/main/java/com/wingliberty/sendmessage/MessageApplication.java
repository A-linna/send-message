package com.wingliberty.sendmessage;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author aiLun
 * @date 2023/4/22-12:17
 */
@SpringBootApplication
@EnableFeignClients
public class MessageApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public IRule iRule() {
        return   new NacosRule();
    }
    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class);
    }
}
