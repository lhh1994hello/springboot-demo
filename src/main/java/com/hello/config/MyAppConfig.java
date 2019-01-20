package com.hello.config;

import com.hello.service.GirlService;
import com.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhh
 * @date 2019/1/20 22:54
 * @Description: 配置类
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中，
     * 容器中的组件默认id就是方法名
     * @return
     */
    @Bean
    public GirlService girlService(){
        return  new GirlService();
    }
}
