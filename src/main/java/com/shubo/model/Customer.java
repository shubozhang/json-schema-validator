package com.shubo.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by k26511 on 5/10/2017.
 */

public class Customer {

    @SerializedName("username")
    private String name;
    @SerializedName("user_id")
    private int id;

    @SerializedName("orders")
    private List<Order> orders;

    @SerializedName("cards")
    private List<Card> cards;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", orders=" + orders +
                ", cards=" + cards +
                '}';
    }
}
