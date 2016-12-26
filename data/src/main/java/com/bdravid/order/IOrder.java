package com.bdravid.order;

/**
 * Created by Bdravid on 26/12/2016.
 */
public interface IOrder {
    String getOrderId();
    String getCommodityId();
    OrderSide getOrderSide();
    long getVolume();
    long getFilledVolume();
    double getPrice();
    String getComment();

    public static enum OrderSide {
        Buy, Sell;
    }

}
