package com.xn.springclouddemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //声明这是一个Eureka服务
@SpringBootApplication
public class SpringCloudDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemo01Application.class, args);

    }



}
