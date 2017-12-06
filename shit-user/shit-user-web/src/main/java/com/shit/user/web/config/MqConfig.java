package com.shit.user.web.config;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

/**
 * @TODO
 * @author Long
 * @date 2017年12月7日下午5:49:39
 */
@Configuration
public class MqConfig {

	@Bean  
    public JmsListenerContainerFactory<?> topicListenerFactory(ConnectionFactory connectionFactory) {  
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();  
        factory.setPubSubDomain(true);  
        factory.setConnectionFactory(connectionFactory);  
        return factory;  
    }
  
    @Bean  
    public JmsListenerContainerFactory<?> queueListenerFactory(ConnectionFactory connectionFactory) {  
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();  
        factory.setPubSubDomain(false);  
        factory.setConnectionFactory(connectionFactory);  
        return factory;  
    }
}
