package com.muhardin.endy.belajar.spring.integration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        final AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        context.registerShutdownHook();
    }
}
