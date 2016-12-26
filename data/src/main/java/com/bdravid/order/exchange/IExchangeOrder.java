package com.bdravid.order.exchange;

import java.math.BigDecimal;

/**
 * Created by Bdravid on 26/12/2016.
 */
public interface IExchangeOrder {
    String getParentId();
    String getId();
    String getCommodityId();
    BuySell getBuyOrSell();
    long getVolume();
    BigDecimal getPrice();
    long getFilledVolume();

    public static enum BuySell{
        Buy, Sell;
    }
}
