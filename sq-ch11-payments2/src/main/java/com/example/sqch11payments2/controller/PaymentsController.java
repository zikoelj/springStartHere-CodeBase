package com.example.sqch11payments2.controller;

import com.example.sqch11payments2.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {
    private static Logger logger =
            Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(@RequestHeader String requestId,
                                                 @RequestBody Payment payment
    ) {
       // String newPaymentId = UUID.randomUUID().toString();

        payment.setId(requestId);
        logger.info("Received request with ID " + requestId +
                " ;Payment Amount: " + payment.getAmount());

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(payment);
    }
}
