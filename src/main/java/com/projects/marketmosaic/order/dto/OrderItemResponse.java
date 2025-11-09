package com.projects.marketmosaic.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemResponse {
    private Long productId;
    private String productName;
    private int quantity;
    private BigDecimal price; // price per unit at order creation
    private BigDecimal subtotal; // quantity * price
    private boolean available; // whether stock was available
}
