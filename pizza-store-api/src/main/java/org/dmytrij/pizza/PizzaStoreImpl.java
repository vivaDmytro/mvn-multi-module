package org.dmytrij.pizza;

import com.google.common.collect.Lists;
import org.apache.log4j.Logger;
import org.dmytrij.models.Order;
import org.dmytrij.models.Pizza;
import org.dmytrij.tools.PizzaName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 13.09.14.
 */
public class PizzaStoreImpl implements PizzaStore {

    private final static Logger LOGGER = Logger.getLogger(PizzaStoreImpl.class);

    @Override
    public List<Pizza> getMenu() {

        LOGGER.info("get menu");

        List<Pizza> menu = Lists.newArrayList(
                new Pizza(PizzaName.Carbonara),
                new Pizza(PizzaName.Cassia),
                new Pizza(PizzaName.Margarita),
                new Pizza(PizzaName.Verdure),
                new Pizza(PizzaName.Verona)
        );
        return menu;
    }

    @Override
    public Order createOrder(List<Integer> pizzaIds, Date orderDate, String address) {

        LOGGER.info("create order");

        List<Pizza> pizzas = new ArrayList<Pizza>();

        for (Integer id : pizzaIds) {
            pizzas.add(new Pizza(id));
        }

        return new Order(pizzas, address, orderDate, 0.01d);
    }

    @Override
    public void cancelOrder(Integer id) {

        LOGGER.info("cancel order");
    }
}
