package com.example.Proxy;

import com.example.Model.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
public class PaymentsProxy {

    @Value("${name.service.url}")
    private String url;
    private final WebClient webClient;
    public PaymentsProxy(WebClient webClient){
        this.webClient = webClient;
    }
    public Mono<Payment> createPayment(String requestId, Payment payment){
        return webClient.post()
                .uri(url + "/payment")
                .header("requestId",requestId)
                .body(Mono.just(payment), Payment.class)
                .retrieve()
                .bodyToMono(Payment.class);
    }

}
