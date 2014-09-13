package org.dmytrij.pizza;

import org.dmytrij.models.Order;
import org.dmytrij.models.Pizza;

import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 13.09.14.
 */
public interface PizzaStore {

    List<Pizza> getMenu();
    Order createOrder(List<Integer> pizzaIds, Date orderDate, String address);
    void cancelOrder(Integer id);
}
