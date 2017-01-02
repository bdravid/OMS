package com.bdravid.oms.external;

import com.bdravid.requestresponse.Request;
import com.bdravid.requestresponse.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bdravid on 27/12/2016.
 */
public class OrderRequestHandler {
    private static final Logger logger = LoggerFactory.getLogger(OrderRequestHandler.class);

    public Response handle(Request request) {
        long entryTime = System.currentTimeMillis();
        if (request == null) {
            logger.info("null request received");
            return Response.toEmptyRequest(System.currentTimeMillis() - entryTime);
        }



        logger.info("Handling request {}", request);
    }
}
