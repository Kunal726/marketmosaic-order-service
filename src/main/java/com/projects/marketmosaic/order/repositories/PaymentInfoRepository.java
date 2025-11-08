package com.projects.marketmosaic.order.repositories;

import com.projects.marketmosaic.order.entities.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long> {
    List<PaymentInfo> findByOrderId(String orderId);
}
