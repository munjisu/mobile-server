package com.mobileserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/stores")
public class StoreController {

    @GetMapping
    public void getStore() {
        System.out.println("getStore");
    }
}
