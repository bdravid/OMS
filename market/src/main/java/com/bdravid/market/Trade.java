package com.bdravid.market;

import com.bdravid.order.exchange.IExchangeOrder;

/**
 * Created by Bdravid on 27/12/2016.
 */
public class Trade {
    private final String commodityId;
    private final String exchangeTradeId;
    private final double price;
    private final long volume;
    private final IExchangeOrder.BuySell buySell;

    public Trade(String commodityId, String exchangeTradeId, double price, long volume, IExchangeOrder.BuySell buySell) {
        this.commodityId = commodityId;
        this.exchangeTradeId = exchangeTradeId;
        this.price = price;
        this.volume = volume;
        this.buySell = buySell;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public String getExchangeTradeId() {
        return exchangeTradeId;
    }

    public double getPrice() {
        return price;
    }

    public long getVolume() {
        return volume;
    }

    public IExchangeOrder.BuySell getBuySell() {
        return buySell;
    }
}
