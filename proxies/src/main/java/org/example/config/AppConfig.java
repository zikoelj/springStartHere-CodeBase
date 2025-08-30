package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false) // Force CGLIB
@ComponentScan(basePackages = {"org.example.service", "org.example.aspect"})
public class AppConfig {

}
