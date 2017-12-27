package com.shit.user.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:META-INF/spring/applicationContext-*.xml")
@Configuration  
@ComponentScan(basePackages = {"com.shit.user.service.impl"})
@EnableAutoConfiguration
@MapperScan("com.shit.user.dao.mapper")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}