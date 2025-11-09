package com.projects.marketmosaic.order.dto;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import com.projects.marketmosaic.order.enums.OrderStatus;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderReturnResponse extends BaseRespDTO {
    private String orderId;
    private OrderStatus orderStatus;
}
