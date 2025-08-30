package org.example.main;


import org.example.config.AppConfig;
import org.example.service.ClientService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var client = ctx.getBean(ClientService.class);
        client.verifierProxy();
        ctx.close();
    }
}