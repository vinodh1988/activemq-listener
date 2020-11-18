package com.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

	@JmsListener(destination = "MyQueue")
	public void receive(String message) {
		System.out.println(message);
	}
}
