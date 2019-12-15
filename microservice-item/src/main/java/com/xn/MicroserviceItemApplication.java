package com.xn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Lemon on 2019/12/13.
 */
@EnableDiscoveryClient // 客户端的声明
@SpringBootApplication
public class MicroserviceItemApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceItemApplication.class, args);

    }
}
