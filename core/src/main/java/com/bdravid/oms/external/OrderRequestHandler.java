package com.bdravid.oms.external;

import com.bdravid.requestresponse.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bdravid on 27/12/2016.
 */
public class OrderRequestHandler {
    private static final Logger logger = LoggerFactory.getLogger(OrderRequestHandler.class);

    public void handle(Request request) {
        if (request == null) {
            logger.info("null request received");
            return;
        }
        logger.info("Handling request {}", request);
        if(request.get)
    }
}
