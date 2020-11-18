package com.activemq.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqListenerQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqListenerQueueApplication.class, args);
	}

}
