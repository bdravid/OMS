package com.bdravid.requestresponse;

/**
 * Created by Bdravid on 26/12/2016.
 */
public class AmendOrderRequest implements IRequestBody{
    private String orderId;
    private Long newVolume;
    private Double newPrice;
    private String newComment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getNewVolume() {
        return newVolume;
    }

    public void setNewVolume(Long newVolume) {
        this.newVolume = newVolume;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public String getNewComment() {
        return newComment;
    }

    public void setNewComment(String newComment) {
        this.newComment = newComment;
    }

    @Override
    public String toString() {
        return "AmendOrderRequest{" +
                "orderId='" + orderId + '\'' +
                ", newVolume=" + newVolume +
                ", newPrice=" + newPrice +
                ", newComment='" + newComment + '\'' +
                '}';
    }
}
