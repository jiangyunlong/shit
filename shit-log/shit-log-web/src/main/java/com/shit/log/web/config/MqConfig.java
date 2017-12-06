package com.shit.log.web.config;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @TODO
 * @author Long
 * @date 2017年12月7日下午5:05:11
 */
@Configuration
public class MqConfig {
	 
	@Bean
    public Queue queue1() {
        return new ActiveMQQueue("sample.queue1");
    }
	
	@Bean
    public Queue queue2() {
        return new ActiveMQQueue("sample.queue2");
    }
	
	@Bean
	public Topic topic1(){
		return new ActiveMQTopic("sample.topic1");
	}
    
}
