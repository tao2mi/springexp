package com.ybq.webannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(value = "com.ybq.webannotation", excludeFilters = @ComponentScan.Filter(Repository.class))
public class Configuration1 {

    @Bean
    @Lazy
    public WebClassOne classOne(@Value("classoneName") String name) {
        return new WebClassOne(name);
    }

    public void work() {
        System.out.println("Configuration1 work.......");
    }

}
