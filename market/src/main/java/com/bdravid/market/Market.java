package com.bdravid.market;

import com.bdravid.order.exchange.IExchangeOrder;

/**
 * Created by Bdravid on 26/12/2016.
 */
public interface Market {
    String submit(IExchangeOrder order);
}
