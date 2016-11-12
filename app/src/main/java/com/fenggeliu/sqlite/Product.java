package com.fenggeliu.sqlite;

/**
 * Created by fengge on 11/11/2016.
 */

public class Product {

    private int _id;
    private String _productname;

    public Product() {
    }

    public Product(String productname) {
        this._productname = productname;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }
}
