package com.muhardin.endy.belajar.spring.integration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitChannel {
	public static void main(String[] args) {
		System.out.println("Silahkan mengetik pesan");
		
		AbstractApplicationContext ctx 
		= new ClassPathXmlApplicationContext("classpath:rabbit-channel.xml");
		ctx.registerShutdownHook();

        GatewayDemo gw = ctx.getBean(GatewayDemo.class);
        gw.kirim("Test kirim pesan");
    }
}
