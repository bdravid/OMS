package com.bdravid.requestresponse;

import com.bdravid.order.IOrder;

/**
 * Created by Bdravid on 26/12/2016.
 */
public class NewOrderRequest {
    private final String commodityId;
    private final long volume;
    private final double price;
    private final IOrder.OrderSide side;

    public NewOrderRequest(String commodityId, long volume, double price, IOrder.OrderSide side) {
        this.commodityId = commodityId;
        this.volume = volume;
        this.price = price;
        this.side = side;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public long getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public IOrder.OrderSide getSide() {
        return side;
    }
}
