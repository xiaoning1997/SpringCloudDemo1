package cn.xn.order.service;

import cn.xn.order.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Lemon on 2019/12/13.
 */
@Service
public class ItemService {

    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired //从配置文件中读取
//    private OrderProperties orderProperties;

    @Autowired
    private DiscoveryClient discoveryClient; // 注意这里的 导包

//    @Value("${mall.item.url}")
//    private String mallItemUrl;

    /**
     * 调用商品的微服务提供的接口进行查询数据
     *
     * @param id
     * @return
     */
//    public Item queryItemById(Long id) {
//        String url = orderProperties.getItem().getUrl() + id;
//        return this.restTemplate.getForObject(url, Item.class);
//    }
    public Item queryItemById(Long id) {
        String serviceId = "MALL-MICROSERVICE-ITEM";
        List<ServiceInstance> instances = this.discoveryClient.getInstances(serviceId);
        if(instances.isEmpty()) {
            return null;
        }
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort()
                + "/item/" + id;
        return this.restTemplate.getForObject(url, Item.class);
    }
}
