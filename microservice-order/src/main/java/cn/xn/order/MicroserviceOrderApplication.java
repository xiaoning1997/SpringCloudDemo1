package cn.xn.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Lemon on 2019/12/13.
 */
@SpringBootApplication
public class MicroserviceOrderApplication {

    @Bean //向容器中定义RestTemplate对象
    public RestTemplate restTemplate() {
//        return new RestTemplate();
        // 使用OkHttp的方式调用其他微服务
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());

    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOrderApplication.class, args);
    }
}
