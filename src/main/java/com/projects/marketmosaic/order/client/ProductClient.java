package com.projects.marketmosaic.order.client;

import com.projects.marketmosaic.common.dto.product.resp.ProductRespDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "product-service", url = "http://product-service:8082")
public interface ProductClient {
    @PostMapping("/products")
    ProductRespDTO getProducts(@RequestBody List<String> productIds, @RequestHeader("Cookie") String cookieHeader);
}