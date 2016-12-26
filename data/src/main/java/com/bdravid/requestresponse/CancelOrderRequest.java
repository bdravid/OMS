package com.bdravid.requestresponse;

/**
 * Created by Bdravid on 26/12/2016.
 */
public class CancelOrderRequest {
    private final String orderId;

    public CancelOrderRequest(String orderId) {
        this.orderId = orderId;
    }
}
