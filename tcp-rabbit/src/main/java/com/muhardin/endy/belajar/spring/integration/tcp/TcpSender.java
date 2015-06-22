package com.muhardin.endy.belajar.spring.integration.tcp;

import com.muhardin.endy.belajar.spring.integration.GatewayDemo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TcpSender {
    public static void main(String[] args) {
        AbstractApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:tcp-sender.xml");
        ctx.registerShutdownHook();

        GatewayDemo gw = ctx.getBean(GatewayDemo.class);
        gw.kirim("Halo");
    }
}
