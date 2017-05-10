package com.shubo.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by k26511 on 5/10/2017.
 */
public class Card {

    @SerializedName("issuer")
    private String issuer;
    @SerializedName("card_number")
    private BigDecimal cardNm;
    @SerializedName("expiration_date")
    private Date xDate;
    @SerializedName("card_holder")
    private String name;


    public Card(String issuer, BigDecimal cardNm, Date xDate, String name) {
        this.issuer = issuer;
        this.cardNm = cardNm;
        this.xDate = xDate;
        this.name = name;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public BigDecimal getCardNm() {
        return cardNm;
    }

    public void setCardNm(BigDecimal cardNm) {
        this.cardNm = cardNm;
    }

    public Date getxDate() {
        return xDate;
    }

    public void setxDate(Date xDate) {
        this.xDate = xDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "issuer='" + issuer + '\'' +
                ", cardNm=" + cardNm +
                ", xDate=" + xDate +
                ", name='" + name + '\'' +
                '}';
    }
}
