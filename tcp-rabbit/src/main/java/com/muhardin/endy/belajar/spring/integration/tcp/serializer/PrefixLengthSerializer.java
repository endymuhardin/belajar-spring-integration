package com.muhardin.endy.belajar.spring.integration.tcp.serializer;


import org.springframework.core.serializer.Deserializer;
import org.springframework.core.serializer.Serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PrefixLengthSerializer implements Serializer<String>, Deserializer<String> {

    private int prefixLength = 4;

    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }

    @Override
    public String deserialize(InputStream inputStream) throws IOException {
        String lengthString = parseString(inputStream, prefixLength);
        System.out.println("Length : "+lengthString);
        String message = parseString(inputStream, Integer.valueOf(lengthString));
        System.out.println("Message : "+message);
        return message;
    }

    @Override
    public void serialize(String s, OutputStream outputStream) throws IOException {
        int length = s.getBytes().length;
        String strLength = "000"+length;
        outputStream.write(strLength.getBytes());
        outputStream.write(s.getBytes());
    }

    private String parseString(InputStream inputStream, int length) throws IOException {
        StringBuilder builder = new StringBuilder();

        int c;
        for (int i = 0; i < length; ++i) {
            c = inputStream.read();
            checkClosure(c);
            builder.append((char)c);
        }

        return builder.toString();
    }

    protected void checkClosure(int bite) throws IOException {
        if (bite < 0) {
            System.out.println("Socket closed during message assembly");
            throw new IOException("Socket closed during message assembly");
        }
    }
}
