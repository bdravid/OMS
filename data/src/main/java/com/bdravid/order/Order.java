package com.bdravid.order;

/**
 * Not thread safe
 * Created by Bdravid on 26/12/2016.
 */
public class Order implements IOrder {
    private final String orderId;
    private final String commodityId;
    private long volume;
    private long filledVolume;
    private double price;
    private OrderSide side;
    private String comment;

    public Order(String orderId, String commodityId, long volume, long filledVolume, double price, OrderSide side, String comment) {
        this.orderId = orderId;
        this.commodityId = commodityId;
        this.volume = volume;
        this.filledVolume = filledVolume;
        this.price = price;
        this.side = side;
        this.comment = comment;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public OrderSide getOrderSide() {
        return side;
    }

    public long getVolume() {
        return volume;
    }

    public long getFilledVolume() {
        return filledVolume;
    }

    public double getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }
}
