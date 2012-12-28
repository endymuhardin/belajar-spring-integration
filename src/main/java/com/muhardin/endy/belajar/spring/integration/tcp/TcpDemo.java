package com.muhardin.endy.belajar.spring.integration.tcp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TcpDemo {
    public static void main(String[] args) throws Exception {
        AbstractApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:tcp-receiver.xml");
        ctx.registerShutdownHook();

        System.out.println("Menjalankan client");

        Socket socket = new Socket("localhost", 11111);
        String message = "0004HALO";
        socket.getOutputStream().write(message.getBytes());
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data;
        while((data = reader.readLine()) != null){
            System.out.println("Data : "+data);
        }
        reader.close();
        socket.close();
    }
}
