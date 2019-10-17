package com.ybq.webannotation;

import com.ybq.annotation.ClassOne;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
//@ComponentScan(value = "com.ybq.annotation", excludeFilters = @ComponentScan.Filter(Repository.class))
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
