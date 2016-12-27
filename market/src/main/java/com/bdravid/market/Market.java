package com.bdravid.market;

import com.bdravid.order.exchange.IExchangeOrder;

/**
 * Created by Bdravid on 26/12/2016.
 */
public interface Market {
    Status insertOrder(IExchangeOrder order);

    Status modifyOrder(String exchangeOrderId, long newVolume);

    Status modifyOrder(String exchangeOrderId, double newPrice);

    Status modifyOrder(String exchangeOrderId, long newVolume, double newPrice);

    void registerTradeListener(TradeListener listener);


    public class Status{
        public static final int SUCCESS = 0;
        public static final int FAILURE = 1;

        private final String message;
        private final int returnCode;

        public Status(String message, int returnCode) {
            this.message = message;
            this.returnCode = returnCode;
        }

        public String getMessage() {
            return message;
        }

        public int getReturnCode() {
            return returnCode;
        }
    }
}
