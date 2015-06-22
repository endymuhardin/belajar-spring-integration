package com.muhardin.endy.belajar.spring.integration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pengirim {
	public static void main(String[] args) {
		System.out.println("Mulai menjalankan pengirim");
		
		AbstractApplicationContext ctx 
		= new ClassPathXmlApplicationContext("classpath:pengirim.xml");
		ctx.registerShutdownHook();
		
		System.out.println("Pengirim siap");
	}
}
