package com.projects.marketmosaic.order.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusTimeline {
    private String status;      // e.g. CREATED, SHIPPED, DELIVERED
    private String message;     // human readable message
    private String timestamp;   // ISO formatted time e.g. "2025-10-12T14:32:00"
}