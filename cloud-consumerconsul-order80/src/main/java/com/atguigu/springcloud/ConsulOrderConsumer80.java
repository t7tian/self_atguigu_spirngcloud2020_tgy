package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsulOrderConsumer80
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderConsumer80.class, args);
    }
}
