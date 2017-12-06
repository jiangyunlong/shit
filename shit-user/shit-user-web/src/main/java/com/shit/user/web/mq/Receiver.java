package com.shit.user.web.mq;

import java.util.List;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @TODO
 * @author Long
 * @date 2017年12月7日下午3:37:54
 */
@Component
public class Receiver {
	
	@JmsListener(destination = "sample.queue1", containerFactory="queueListenerFactory")
    public void receiveQueue1(List<String> list) {
        System.out.println("--------------" + list.toString() + "-------------");
    }
	
	@JmsListener(destination = "sample.queue1", containerFactory="queueListenerFactory")
    public void receiveQueue11(List<String> list) {
        System.out.println("@@@@@@@@@@@@@@" + list.toString() + "@@@@@@@@@@@@@");
    }
	
	@JmsListener(destination = "sample.queue2", containerFactory="queueListenerFactory")
    public void receiveQueue2(String text) {
        System.out.println("==============" + text + "=============");
    }
	
	@JmsListener(destination = "sample.topic1", containerFactory="topicListenerFactory")
    public void receiveTopic1(String text) {
        System.out.println("**************" + text + "*************");
    }
	
	@JmsListener(destination = "sample.topic1", containerFactory="topicListenerFactory")
    public void receiveTopic11(String text) {
        System.out.println("&&&&&&&&&&&&&&" + text + "&&&&&&&&&&&&&");
    }

}
