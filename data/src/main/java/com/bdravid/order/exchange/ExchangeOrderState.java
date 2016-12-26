package com.bdravid.order.exchange;

import com.bdravid.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bdravid on 26/12/2016.
 */
public class ExchangeOrderState {
    private final Order order;
    private List<IExchangeOrder> exchangeOrderList;
    private OrderState orderState;

    public enum OrderState{
        New, InsertSent, InsertAccepted, InsertRejected,
        Filled, PartiallyFilled,
        CancelSent, CancelAccpeted, CancelRejected;
    }

    public ExchangeOrderState(Order order) {
        this.order = order;
        this.orderState = OrderState.New;
        this.exchangeOrderList = new ArrayList<>();
    }

    public Order getOrder() {
        return order;
    }

    public List<IExchangeOrder> getExchangeOrderList() {
        return exchangeOrderList;
    }

    public OrderState getOrderState() {
        return orderState;
    }
}
