package com.bdravid.requestresponse;

/**
 * Created by Bdravid on 01/01/2017.
 */
public class ResponseHeader {
    private long processingTime;
    private String message;
    private int messageCode;

    public long getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(long processingTime) {
        this.processingTime = processingTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }
}
