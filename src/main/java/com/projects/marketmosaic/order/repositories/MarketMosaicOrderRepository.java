package com.projects.marketmosaic.order.repositories;

import com.projects.marketmosaic.order.entities.MarketMosaicOrder;
import com.projects.marketmosaic.order.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarketMosaicOrderRepository extends JpaRepository<MarketMosaicOrder, String> {
    List<MarketMosaicOrder> findByUserId(Long userId);

    List<MarketMosaicOrder> findByUserIdAndStatus(Long userId, OrderStatus status);
}
