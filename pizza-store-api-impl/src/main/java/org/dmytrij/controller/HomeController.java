package org.dmytrij.controller;

import org.apache.log4j.Logger;
import org.dmytrij.models.Order;
import org.dmytrij.models.Pizza;
import org.dmytrij.pizza.PizzaStoreImpl;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    private final static Logger LOGGER = Logger.getLogger(HomeController.class);

	@RequestMapping(value="/")
	public ModelAndView home() throws IOException {
		return new ModelAndView("home");
	}

    @RequestMapping(value = "/menu", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Pizza> onMenu() {

        LOGGER.info("get menu list");
        return new PizzaStoreImpl().getMenu();
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    @ResponseBody
    public Order onOrder(@RequestParam String pizzaId, @RequestParam String address) {

        LOGGER.info("create order pizzaId: " + pizzaId + " address: " + address);
        List<Integer> pizzaIds = new ArrayList<Integer>();

        for (String id : Arrays.asList(pizzaId.split(","))) {
            pizzaIds.add(Integer.valueOf(id));
        }

        return new PizzaStoreImpl().createOrder(pizzaIds, new Date(), address);
    }

    @RequestMapping(value = "/cancelOrder", method = RequestMethod.GET)
    @ResponseBody
    public void onCancelOrder(@RequestParam String id) {

        new PizzaStoreImpl().cancelOrder(Integer.valueOf(id));
        LOGGER.info("cancel order: " + id);
    }
}
