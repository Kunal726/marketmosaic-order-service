package com.projects.marketmosaic.order.dto;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderGetResponse extends BaseRespDTO {
    List<OrderSummaryResponse> ordersSummary;
}
