package cn.xn.order.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Lemon on 2019/12/15.
 */
@Component
@ConfigurationProperties(prefix = "mall") //以mall开头的配置被匹配
@Getter
@Setter
public class OrderProperties {

    private ItemProperties item = new ItemProperties();
}
