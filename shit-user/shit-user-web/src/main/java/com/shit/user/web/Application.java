package com.shit.user.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.DispatcherServlet;

@ImportResource("classpath:META-INF/spring/applicationContext-*.xml")
@Configuration  
@ComponentScan(basePackages = {"com.shit.user.service.impl"})
@EnableAutoConfiguration
@MapperScan("com.shit.user.dao.mapper")
public class Application {

    public static void main(String[] args) throws Exception {
    	
    	//AnnotationConfigApplicationContext
    	//DispatcherServlet
    	
        SpringApplication.run(Application.class, args);
    }
    
    @Transactional
    public void add(){
    	
    }
}