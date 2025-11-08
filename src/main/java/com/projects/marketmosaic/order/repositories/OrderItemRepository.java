package com.projects.marketmosaic.order.repositories;

import com.projects.marketmosaic.order.entities.MarketMosaicOrder;
import com.projects.marketmosaic.order.entities.OrderItem;
import com.projects.marketmosaic.order.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrder_OrderId(String orderId);
}
