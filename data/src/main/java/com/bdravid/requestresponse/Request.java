package com.bdravid.requestresponse;

/**
 * Created by Bdravid on 27/12/2016.
 */
public class Request {
    private final RequestHeader requestHeader;
    private final IRequestBody requestBody;

    public Request(RequestHeader requestHeader, IRequestBody requestBody) {
        this.requestHeader = requestHeader;
        this.requestBody = requestBody;
    }

    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    public IRequestBody getRequestBody() {
        return requestBody;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestHeader=" + requestHeader +
                ", requestBody=" + requestBody +
                '}';
    }
}
