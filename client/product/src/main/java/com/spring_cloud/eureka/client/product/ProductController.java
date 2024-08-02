package com.spring_cloud.eureka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // 애플리케이션이 실행 중인 포트를 주입받습니다.
    @Value("${server.port}")
    private String serverPort;

    // @GetMapping("/product/{id}")
    @GetMapping("/product")
    public String getProduct(@PathVariable String id) {
        // return "Product " + id + " info!!!!! From port : " + serverPort ;
        return "Product info!!!!! From port : " + serverPort;

    }

}