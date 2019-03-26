package com.yang7.springcloud.sleuth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FeignClients",url = "localhost:8080")
public interface FeignClients {
    @GetMapping("/test1")
     String test1();
}
