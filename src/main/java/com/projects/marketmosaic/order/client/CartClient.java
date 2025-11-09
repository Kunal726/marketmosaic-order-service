package com.projects.marketmosaic.order.client;

import com.projects.marketmosaic.common.dto.cart.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "cart-service", url = "http://cart-service:8083")
public interface CartClient {

    @GetMapping(path = "/user/cart")
    CartDTO getCart(@RequestHeader("Cookie") String cookieHeader);
}
