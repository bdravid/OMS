package com.bdravid.requestresponse;

/**
 * Created by Bdravid on 26/12/2016.
 */
public class AmendOrderRequest {
    private String orderId;
    private long newVolume;
    private long newPrice;
    private String newComment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public long getNewVolume() {
        return newVolume;
    }

    public void setNewVolume(long newVolume) {
        this.newVolume = newVolume;
    }

    public long getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(long newPrice) {
        this.newPrice = newPrice;
    }

    public String getNewComment() {
        return newComment;
    }

    public void setNewComment(String newComment) {
        this.newComment = newComment;
    }
}
