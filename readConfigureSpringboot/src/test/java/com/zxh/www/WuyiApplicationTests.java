package com.zxh.www;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WuyiApplicationTests {
    //读取配置信息
    @Value("${my.url}")
    String  url  ;

    //读取配置星系
    @Value("${my.data}")
    String  data  ;

    @Autowired
    Content content ;

    @Test
    void contextLoads() {
        System.out.println();
        System.out.println("读取URL:"+url);
        System.out.println("读取Data"+data);
    }

    @Test
    void readContent() {
        System.out.println();
        System.out.println("读取URL:"+content.getUrl());
        System.out.println("读取Data"+content.getData());
    }
}
