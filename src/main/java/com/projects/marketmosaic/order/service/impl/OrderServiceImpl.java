package com.projects.marketmosaic.order.service.impl;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import com.projects.marketmosaic.order.dto.*;
import com.projects.marketmosaic.order.service.OrderService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderCreateResponse createOrder(HttpServletRequest request, CreateOrderReqDTO createOrderReqDTO) {
        return null;
    }

    @Override
    public OrderPlaceResponse placeOrder(HttpServletRequest request, String orderId) {
        return null;
    }

    @Override
    public BaseRespDTO cancelOrder(HttpServletRequest request, OrderCancelRequest cancelOrderRequest, String orderId) {
        return null;
    }

    @Override
    public OrderReturnResponse returnOrder(HttpServletRequest request, OrderReturnRequest returnOrderRequest, String orderId) {
        return null;
    }

    @Override
    public OrderTrackResponse trackOrder(HttpServletRequest request, String orderId) {
        return null;
    }

    @Override
    public OrderGetResponse getOrders(HttpServletRequest request) {
        return null;
    }

    @Override
    public OrderDetailResponse getOrderById(HttpServletRequest request, String orderId) {
        return null;
    }

    @Override
    public UpdateOrderResponse updateOrder(HttpServletRequest request, UpdateOrderRequest updateOrderRequest) {
        return null;
    }
}
