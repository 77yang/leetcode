package com.example.webflux;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FeignClients",url = "localhost:9999")
public interface FeignClients {
    @GetMapping("/")
     String get();
}
