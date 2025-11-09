package com.projects.marketmosaic.order.dto;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailResponse extends BaseRespDTO {
    private String orderId;
    private LocalDateTime createdAt;
    private double totalAmount;
    private String orderStatus;
    private String paymentMode;
    private String paymentId;     // if online
    private AddressResponse address;
    private List<OrderItemSummary> items;
    private List<StatusTimeline> timeline;
}
