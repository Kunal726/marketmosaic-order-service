package com.projects.marketmosaic.order.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCancelRequest {
    @NotBlank(message = "Reason cannot be blank")
    private String reason;
}