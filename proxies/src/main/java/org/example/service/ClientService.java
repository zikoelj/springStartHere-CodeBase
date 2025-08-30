package org.example.service;

import org.springframework.stereotype.Service;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.springframework.aop.support.AopUtils;


@Service
public class ClientService {

    private MonService monService;

   public ClientService(MonService monService) {
        this.monService = monService;

    }



    public void verifierProxy() {
//        System.out.println("Est proxy JDK? " + Proxy.isProxyClass(monService.getClass()));
//        System.out.println("toString: " + monService.toString());
        monService.hello();
        monService.faireQuelqueChose();
        System.out.println("Is proxy? " + AopUtils.isAopProxy(monService));
        System.out.println("Proxy type: " + monService.getClass().getName());
        }

//        System.out.println("Interfaces implémentées : " +
//                Arrays.toString(monService.getClass().getInterfaces()));
//        System.out.println("Classe parente : " +
//                monService.getClass().getSuperclass());
//        System.out.println("Classe du bean: " + monService.getClass());
//        System.out.println("Est proxy Spring ? " + AopUtils.isAopProxy(monService));
//        System.out.println("Est proxy JDK ? " + AopUtils.isJdkDynamicProxy(monService));
//        System.out.println("Est proxy CGLIB ? " + AopUtils.isCglibProxy(monService));
    }