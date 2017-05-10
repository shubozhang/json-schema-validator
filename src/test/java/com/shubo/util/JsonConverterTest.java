package com.shubo.util;

import com.shubo.model.Card;
import com.shubo.model.Customer;
import com.shubo.model.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by k26511 on 5/10/2017.
 */
public class JsonConverterTest {

    @Test
    public void toJsonFile() throws Exception {
        Customer customer = new Customer("Aaron", 1000);

        List<Order> orderList = new ArrayList<>();
        Order order = new Order(101,Timestamp.valueOf("2016-01-05 12:31:15.872"),55.23);
        Order order1 = new Order(102,Timestamp.valueOf("2016-01-15 12:11:15.872"),155.23);
        orderList.add(order);
        orderList.add(order1);

        List<Card> cardList = new ArrayList<>();
        Card card = new Card("visa", new BigDecimal("4321876501234567"), Date.valueOf("2020-05-01"),"Aaron");
        Card card1 = new Card("master", new BigDecimal("5001876501234567"), Date.valueOf("2022-12-31"),"Bob");
        cardList.add(card);
        cardList.add(card1);

        customer.setOrders(orderList);
        customer.setCards(cardList);

        JsonConverter.toJsonFile(customer);
    }

    @Test
    public void toJsonString() throws Exception {

    }

}