package com.hello;

import com.hello.bean.Book;
import com.hello.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot单元测试
 * 可以在单元测试期间类似编码一样进行自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHello1ApplicationTests {
    @Autowired
    private Person person;
    @Autowired
    private Book book;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void existHelloService() {
        boolean containsBean = ioc.containsBean("helloService");
        System.out.println("helloService是否存在:"+containsBean);
    }
    @Test
    public  void existGirlService(){
        boolean containsBean = ioc.containsBean("girlService");
        System.out.println("girlService是否存在:"+containsBean);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
        System.out.println(book);
    }


}

