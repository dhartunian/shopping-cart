package com.positiondev.ecommerce;

import junit.framework.TestCase;

public class CartTest extends TestCase {

    public void testEmptyCart() {
        Cart emptyCart = Cart.empty();

        assertEquals(emptyCart.numItems(), 0);
    }
}
