package com.projects.marketmosaic.order.service;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import com.projects.marketmosaic.order.dto.*;
import jakarta.servlet.http.HttpServletRequest;

public interface OrderService {
    OrderCreateResponse createOrder(HttpServletRequest request, CreateOrderReqDTO createOrderReqDTO);

    OrderPlaceResponse placeOrder(HttpServletRequest request, String orderId);

    BaseRespDTO cancelOrder(HttpServletRequest request, OrderCancelRequest cancelOrderRequest, String orderId);

    OrderReturnResponse returnOrder(HttpServletRequest request, OrderReturnRequest returnOrderRequest, String orderId);

    OrderTrackResponse trackOrder(HttpServletRequest request, String orderId);

    OrderGetResponse getOrders(HttpServletRequest request);

    OrderDetailResponse getOrderById(HttpServletRequest request, String orderId);

    UpdateOrderResponse updateOrder(HttpServletRequest request, UpdateOrderRequest updateOrderRequest);
}
