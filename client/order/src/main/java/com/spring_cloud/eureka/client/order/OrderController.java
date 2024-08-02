package com.spring_cloud.eureka.client.order;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequiredArgsConstructor
public class OrderController {


    private OrderService orderService;

    // @GetMapping("/order/{orderId}")
    @GetMapping("/order")
    public String getOrder(@PathVariable String orderId) {
        // return orderService.getOrder(orderId);
        return "order details";
    }
}

