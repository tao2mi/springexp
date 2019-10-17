package com.ybq.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

    @Bean
    public Action getAction(ApplicationContext ctx) {
        return new Action(ctx);
    }

    @Bean
    @Primary
    public Action getAction2(ApplicationContext ctx) {
        return new Action(ctx);
    }
}
