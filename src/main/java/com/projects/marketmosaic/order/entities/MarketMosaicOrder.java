package com.projects.marketmosaic.order.entities;

import com.projects.marketmosaic.order.dto.StatusTimeline;
import com.projects.marketmosaic.order.enums.OrderStatus;
import com.projects.marketmosaic.order.enums.PaymentMode;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MARKET_MOSAIC_ORDERS")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarketMosaicOrder {

    @Id
    private String orderId;

    private Long userId;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    private BigDecimal totalAmount;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Embedded
    private AddressSnapshot address;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> items;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "order_timeline", joinColumns = @JoinColumn(name = "order_id"))
    private List<StatusTimeline> timeline = new ArrayList<>();

}
