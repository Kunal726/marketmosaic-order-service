package com.projects.marketmosaic.order.dto;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import com.projects.marketmosaic.order.enums.OrderStatus;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderTrackResponse extends BaseRespDTO {
    private String orderId;
    private OrderStatus currentStatus;
    private List<StatusTimeline> timeline;
    private String trackingId;
    private String courierPartner;
    private String estimatedDelivery;
    private double totalAmount;
    private List<OrderItemResponse> items;
}
