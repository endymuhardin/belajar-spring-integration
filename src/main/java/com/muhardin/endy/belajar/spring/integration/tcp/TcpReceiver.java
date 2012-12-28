package com.muhardin.endy.belajar.spring.integration.tcp;

public class TcpReceiver {
    public String terima(String pesan)  {
        System.out.println("Menerima : "+pesan);
        return "menerima : "+pesan;
    }
}
