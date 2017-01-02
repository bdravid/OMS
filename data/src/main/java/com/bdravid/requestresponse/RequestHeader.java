package com.bdravid.requestresponse;

import java.util.Optional;

/**
 * Created by Bdravid on 27/12/2016.
 */
public class RequestHeader {
    private final String clientId;
    private final String replyTo;
    private final Optional<String> requestId;

    public RequestHeader(String requestId, String clientId, String replyTo) {
        this.clientId = clientId;
        this.replyTo = replyTo;
        this.requestId = Optional.ofNullable(requestId);
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
                ", requestId=" + requestId +
                '}';
    }
}
