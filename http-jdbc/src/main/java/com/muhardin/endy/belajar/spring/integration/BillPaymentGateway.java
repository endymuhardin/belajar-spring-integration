package com.muhardin.endy.belajar.spring.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name="billPaymentGateway")
public interface BillPaymentGateway {
	@Gateway(replyTimeout=3000, requestChannel="hello-request", replyChannel="hello-response")
    public String hello(String name);
}
