package com.example.enumproblemexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {
    @GetMapping(value = "/example/{fooBar}")
    public String getFooBar(@PathVariable FooBar fooBar) {
        return fooBar.name();
    }
}
