package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationConfig
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //使用自己定义的负载均衡类时，要把这个注销掉，因为这个会把http后面的域名看成是服务名称去处理，当然也可以自己定义一个Resttemplate对象
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
