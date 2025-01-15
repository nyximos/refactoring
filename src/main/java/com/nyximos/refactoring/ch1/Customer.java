package com.nyximos.refactoring.ch1;

import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name, Vector rentals) {
        this._name = name;
        this._rentals = rentals;
    }

    public String getName() {
        return _name;
    }
}
