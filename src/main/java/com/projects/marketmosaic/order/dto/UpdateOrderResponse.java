package com.projects.marketmosaic.order.dto;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateOrderResponse extends BaseRespDTO {
    private String orderId;
}