package com.muhardin.endy.belajar.spring.integration;

import org.springframework.stereotype.Service;

@Service
public class ServiceDemo {
    public String halo(String pesan){
        return "Anda mengetik : "+pesan;
    }
}
