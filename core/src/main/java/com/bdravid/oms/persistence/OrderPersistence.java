package com.bdravid.oms.persistence;

import com.bdravid.order.IOrder;

/**
 * Created by Bdravid on 27/12/2016.
 */
public interface OrderPersistence {
    void save(IOrder order);

    IOrder findByOrderId(String orderId);

    IOrder findByExchangeOrderId(String exchangeOrderId);
}
