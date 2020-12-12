package com.grapefruit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class MyConfig {

    @Autowired
    Environment env;

    @Bean(initMethod = "init")
    public Grapefruit getBean(){
        String host = env.getProperty("host");
        return new Grapefruit();

        /// Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk
    }

    @Bean
    public Yellow getYellow(){
        return new Yellow();
    }
}
