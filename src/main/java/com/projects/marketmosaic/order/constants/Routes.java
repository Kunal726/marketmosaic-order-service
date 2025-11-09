package com.projects.marketmosaic.order.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Routes {
    public static final String ORDER_BASE = "/orders";
    public static final String ORDER_PLACE = "/{orderId}/place";
    public static final String ORDER_CREATE = "/create";
    public static final String ORDER_TRACK = "/{orderId}/track";
    public static final String ORDER_CANCEL = "/{orderId}/cancel";
    public static final String ORDER_RETURN = "/{orderId}/return";

    public static final String GET_ORDER = "/{orderId}";
    public static final String UPDATE_ORDER = "/update";
}
