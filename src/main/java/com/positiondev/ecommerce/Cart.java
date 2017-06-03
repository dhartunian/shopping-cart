package com.positiondev.ecommerce;

public class Cart {

    private Cart() {

    }

    public static Cart empty() {
        return new Cart();
    }

    public int numItems() {
        return 0;
    }
}
