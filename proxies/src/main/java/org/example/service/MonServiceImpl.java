package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class MonServiceImpl implements MonService {
    @Override
    public void faireQuelqueChose() {
        System.out.println("Implémentation réelle exécutée !");
    }

    @Override
    public void hello() {
        System.out.println("mqawed");
    }
}