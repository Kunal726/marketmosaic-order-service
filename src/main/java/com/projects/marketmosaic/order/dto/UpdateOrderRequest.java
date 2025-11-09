package com.projects.marketmosaic.order.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateOrderRequest {
    private String orderId;
    private String addressId;
    private String mobile;
    private String receiverName;
    private String deliveryNote;

}
