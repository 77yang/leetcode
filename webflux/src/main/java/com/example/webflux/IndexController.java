package com.example.webflux;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {

    @Autowired
    private FeignClients feignClients;
    @GetMapping("/")
    public String index() {
//        log.info("in webflux-index");
//        log.info(feignClients.get());
        test();
        return "out webflux";
    }

    @GetMapping("/test1")
    public String test1() {
        log.info("in webflux-test1");
        return "out webflux-test1";
    }


    @Async
    void test()  {
        try {
            System.out.println("start");
            Thread.sleep(3000);
            System.out.println("done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
