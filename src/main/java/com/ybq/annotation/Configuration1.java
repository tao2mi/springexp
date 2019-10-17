package com.ybq.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(value = "com.ybq.annotation", excludeFilters = @ComponentScan.Filter(Repository.class))
public class Configuration1 {

    @Bean
    public ClassOne classOne(@Value("classoneName") String name) {
        return new ClassOne(name);
    }

    public void work() {
        System.out.println("Configuration1 work.......");
    }

}
