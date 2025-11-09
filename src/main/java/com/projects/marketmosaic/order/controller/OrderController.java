package com.projects.marketmosaic.order.controller;

import com.projects.marketmosaic.common.dto.resp.BaseRespDTO;
import com.projects.marketmosaic.order.constants.Routes;
import com.projects.marketmosaic.order.dto.*;
import com.projects.marketmosaic.order.service.OrderService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(Routes.ORDER_BASE)
public class OrderController {

    private final OrderService orderService;

    @PostMapping(path = Routes.ORDER_CREATE)
    public ResponseEntity<OrderCreateResponse> createOrder(HttpServletRequest request, @RequestBody CreateOrderReqDTO createOrderReqDTO) {
        OrderCreateResponse response = orderService.createOrder(request, createOrderReqDTO);
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = Routes.ORDER_PLACE)
    public ResponseEntity<OrderPlaceResponse> placeOrder(HttpServletRequest request, @PathVariable("orderId") String orderId) {

        OrderPlaceResponse response = orderService.placeOrder(request, orderId);
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = Routes.ORDER_CANCEL)
    public ResponseEntity<BaseRespDTO> cancelOrder(HttpServletRequest request, @PathVariable("orderId") String orderId, @RequestBody OrderCancelRequest cancelOrderRequest) {

        BaseRespDTO response = orderService.cancelOrder(request, cancelOrderRequest, orderId);
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = Routes.ORDER_RETURN)
    public ResponseEntity<OrderReturnResponse> returnOrder(HttpServletRequest request, @PathVariable("orderId") String orderId, @RequestBody OrderReturnRequest returnOrderRequest) {

        OrderReturnResponse response = orderService.returnOrder(request, returnOrderRequest, orderId);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = Routes.ORDER_TRACK)
    public ResponseEntity<OrderTrackResponse> trackOrder(HttpServletRequest request, @PathVariable("orderId") String orderId) {

        OrderTrackResponse response = orderService.trackOrder(request, orderId);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<OrderGetResponse> getOrders(HttpServletRequest request) {

        OrderGetResponse orderGetResponse = orderService.getOrders(request);
        return ResponseEntity.ok(orderGetResponse);
    }

    @GetMapping(path = Routes.GET_ORDER)
    public ResponseEntity<OrderDetailResponse> getOrderById(HttpServletRequest request, @PathVariable String orderId) {

        OrderDetailResponse response = orderService.getOrderById(request, orderId);
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = Routes.UPDATE_ORDER)
    public ResponseEntity<UpdateOrderResponse> updateOrder(HttpServletRequest request, @RequestBody UpdateOrderRequest updateOrderRequest) {

        UpdateOrderResponse response = orderService.updateOrder(request, updateOrderRequest);
        return ResponseEntity.ok(response);
    }


}
