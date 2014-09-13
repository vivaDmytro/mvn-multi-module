package org.dmytrij.models;

import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 13.09.14.
 */
public class Order {
    private List<Pizza> pizzaList;
    private String address;
    private Date orderDate;
    private Double price;

    public Order(List<Pizza> pizzaList, String address, Date orderDate, Double price) {
        this.pizzaList = pizzaList;
        this.address = address;
        this.orderDate = orderDate;
        this.price = price;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
