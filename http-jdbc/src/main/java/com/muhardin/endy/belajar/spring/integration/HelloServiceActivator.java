package com.muhardin.endy.belajar.spring.integration;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceActivator {
	
	@ServiceActivator(inputChannel="hello-request", outputChannel="hello-response")
	public String handleHello(String name){
		System.out.println("Sleep 10 detik");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello "+name;
	}
}
