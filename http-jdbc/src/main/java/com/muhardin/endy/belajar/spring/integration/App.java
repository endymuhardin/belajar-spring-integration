package com.muhardin.endy.belajar.spring.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
@IntegrationComponentScan
@ImportResource("classpath:http-jdbc-int.xml")
public class App {
    public static void main( String[] args ) {
        ApplicationContext app = SpringApplication.run(App.class, args);
        BillPaymentGateway gw = app.getBean(BillPaymentGateway.class);
        String hasil = gw.hello("endy");
        System.out.println("Hasil : "+hasil);
    }
}
