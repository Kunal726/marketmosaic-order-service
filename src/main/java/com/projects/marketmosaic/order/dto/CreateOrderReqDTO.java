package com.projects.marketmosaic.order.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateOrderReqDTO {
    @NotBlank(message = "Address id Cannot Be Blank")
    private String addressId;
}
