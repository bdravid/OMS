package com.bdravid.requestresponse;

/**
 * Created by Bdravid on 27/12/2016.
 */
public class Response {
    private RequestHeader requestHeader;
    private ResponseHeader responseHeader;
    private IResponseBody responseBody;

    public static Response toEmptyRequest(long processingTime) {
        Response response = new Response();
        ResponseHeader respHeader = new ResponseHeader();
        respHeader.setMessage("Received empty request");
        respHeader.setMessageCode(1);
        respHeader.setProcessingTime(processingTime);
        response.setResponseHeader(respHeader);
        return response;
    }

    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public IResponseBody getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(IResponseBody responseBody) {
        this.responseBody = responseBody;
    }
}
