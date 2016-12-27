package com.bdravid.requestresponse;

/**
 * Created by Bdravid on 27/12/2016.
 */
public class RequestHeader {
    private final String clientId;
    private final String replyTo;

    public RequestHeader(String clientId, String replyTo) {
        this.clientId = clientId;
        this.replyTo = replyTo;
    }

    public String getClientId() {
        return clientId;
    }

    public String getReplyTo() {
        return replyTo;
    }

    @Override
    public String toString() {
        return "RequestHeader{" +
                "clientId='" + clientId + '\'' +
                ", replyTo='" + replyTo + '\'' +
                '}';
    }
}
