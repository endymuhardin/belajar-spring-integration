package com.muhardin.endy.belajar.spring.integration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Penerima {
	public static void main(String[] args) {
		System.out.println("Mulai menjalankan penerima");
		
		AbstractApplicationContext ctx 
		= new ClassPathXmlApplicationContext("classpath:penerima.xml");
		ctx.registerShutdownHook();
		
		System.out.println("Penerima siap");
	}
}
