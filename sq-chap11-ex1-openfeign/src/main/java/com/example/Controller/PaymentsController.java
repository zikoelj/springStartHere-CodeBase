package com.example.Controller;

import com.example.Model.Payment;
import com.example.Proxy.PaymentProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentsController {

    private final PaymentProxy paymentProxy;

    public PaymentsController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }
    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment)
    {
        String requestId = UUID.randomUUID().toString();
         return paymentProxy.createPayment(requestId, payment);
    }
}
