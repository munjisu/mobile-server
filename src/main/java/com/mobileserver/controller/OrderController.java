package com.mobileserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/orders")
public class OrderController {

    @GetMapping
    public void getOrder() {
        System.out.println("getOrder");
    }
}


