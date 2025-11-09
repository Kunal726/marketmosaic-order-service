package com.projects.marketmosaic.order.dto;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderReturnRequest extends OrderCancelRequest {
    private String returnType;
}
