package com.nyximos.refactoring.ch1;

import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name, Vector rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }
}
