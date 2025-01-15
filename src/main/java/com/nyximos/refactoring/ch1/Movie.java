package com.nyximos.refactoring.ch1;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int arg) {
        this._priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }
}
