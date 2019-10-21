package com.ybq.webannotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @RequestMapping("/a")
    public String a() {
        return "a";
    }
}
