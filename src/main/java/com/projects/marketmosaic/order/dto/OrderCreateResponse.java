package com.projects.marketmosaic.order.dto;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import com.projects.marketmosaic.order.enums.OrderStatus;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCreateResponse extends BaseRespDTO {
    private String orderId;
    private OrderStatus orderStatus;
    private BigDecimal totalAmount;
    private List<OrderItemResponse> items;
}