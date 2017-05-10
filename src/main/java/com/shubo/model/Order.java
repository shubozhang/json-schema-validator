package com.shubo.model;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

/**
 * Created by k26511 on 5/10/2017.
 */
public class Order {

    @SerializedName("order_id")
    private int orderId;
    @SerializedName("order_date")
    private Timestamp orderTs;
    @SerializedName("price")
    private double price;

    public Order(int orderId, Timestamp orderTs, double price) {
        this.orderId = orderId;
        this.orderTs = orderTs;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderTs() {
        return orderTs;
    }

    public void setOrderTs(Timestamp orderTs) {
        this.orderTs = orderTs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderTs=" + orderTs +
                ", price=" + price +
                '}';
    }
}
