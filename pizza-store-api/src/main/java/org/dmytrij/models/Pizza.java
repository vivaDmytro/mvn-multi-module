package org.dmytrij.models;

import org.dmytrij.tools.PizzaName;
import org.dmytrij.tools.PizzaSize;

/**
 * Created by Дмитрий on 13.09.14.
 */
public class Pizza {

    private Integer id;
    private PizzaName name;
    private PizzaSize size;
    private Boolean doubleCheese;

    public Pizza() {
    }

    public Pizza(Integer id) {

        this.id = id;

        if (id.equals(1)) {

            name = PizzaName.Carbonara;
            size = PizzaSize.Huge;
            doubleCheese = true;
        } else if (id.equals(2)) {

            name = PizzaName.Cassia;
            size = PizzaSize.Medium;
            doubleCheese = false;
        } else if (id.equals(3)) {

            name = PizzaName.Verona;
            size = PizzaSize.Small;
            doubleCheese = true;
        } else if (id.equals(4)) {

            name = PizzaName.Verdure;
            size = PizzaSize.Large;
            doubleCheese = false;
        }
    }

    public Pizza(PizzaName name) {

        this.name = name;

        if (name.equals(PizzaName.Carbonara)) {

            id = 1;
            size = PizzaSize.Huge;
            doubleCheese = true;
        } else if (name.equals(PizzaName.Cassia)) {

            id = 2;
            size =PizzaSize.Medium;
            doubleCheese = false;
        } else if (name.equals(PizzaName.Margarita)) {

            id = 3;
            size = PizzaSize.Small;
            doubleCheese = true;
        } else if (name.equals(PizzaName.Verdure)) {

            id = 4;
            size = PizzaSize.Large;
            doubleCheese = false;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PizzaName getName() {
        return name;
    }

    public void setName(PizzaName name) {
        this.name = name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public Boolean getDoubleCheese() {
        return doubleCheese;
    }

    public void setDoubleCheese(Boolean doubleCheese) {
        this.doubleCheese = doubleCheese;
    }
}
