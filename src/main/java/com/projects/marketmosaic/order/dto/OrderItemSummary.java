package com.projects.marketmosaic.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemSummary {
    private Long productId;
    private String productName;
    private int quantity;
    private double price;
}
