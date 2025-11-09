package com.projects.marketmosaic.order.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderSummaryResponse {
    private String orderId;
    private double totalAmount;
    private String orderStatus;
    private String paymentMode;
    private String createdAt;
    private List<OrderItemSummary> items;
}
