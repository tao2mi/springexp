package com.ybq.annotation;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class EventListener1 {

    @EventListener(ContextRefreshedEvent.class)
    public void listener(Object event) {
        System.out.println("event............: " + event);
    }

}
