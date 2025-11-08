package com.projects.marketmosaic.order.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Routes {
    public static final String ORDER_BASE = "/orders";
    public static final String ORDER_PLACE = "/place";
    public static final String ORDER_CREATE = "/create";
    public static final String ORDER_TRACK = "/track";
    public static final String ORDER_CANCEL = "/cancel";
    public static final String ORDER_RETURN = "/return";

}
