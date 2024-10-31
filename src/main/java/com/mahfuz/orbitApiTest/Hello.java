package com.mahfuz.orbitApiTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String getText() {
        return "hello mahfuz";
    }
}
