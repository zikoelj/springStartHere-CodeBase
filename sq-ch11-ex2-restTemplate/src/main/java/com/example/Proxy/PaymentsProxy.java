package com.example.Proxy;

import com.example.Model.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import java.util.UUID;


@Component
public class PaymentsProxy {

    @Value("${name.service.url}")
    private String url;
    private  final RestTemplate restTemplate;

    public PaymentsProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment createPayment(Payment payment){
        String uri = url + "/payment";

        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId",UUID.randomUUID().toString());

        HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers);

        ResponseEntity<Payment> response = restTemplate.exchange(
                uri,
                HttpMethod.POST,
                httpEntity,
                Payment.class
        );

        return response.getBody();
    }
}
