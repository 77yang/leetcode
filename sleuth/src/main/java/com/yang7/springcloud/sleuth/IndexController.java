package com.yang7.springcloud.sleuth;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {

    @Autowired
    private FeignClients feignClients;

    @GetMapping("/")
    public String index(ServerHttpRequest request) {
        log.info("in sleuth index");
        log.info(feignClients.test1());
        return "out sleuth";
    }
}
