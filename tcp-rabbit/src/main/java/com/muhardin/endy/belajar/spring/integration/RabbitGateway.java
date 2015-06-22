package com.muhardin.endy.belajar.spring.integration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitGateway {
    public static void main(String[] args) {
        System.out.println("Silahkan mengetik pesan");

        AbstractApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:rabbit-gateway.xml");
        ctx.registerShutdownHook();

        GatewayDemo gw = ctx.getBean(GatewayDemo.class);
        String hasil = gw.kirim("Test kirim pesan");
        System.out.println("Hasil : "+hasil);
    }
}
