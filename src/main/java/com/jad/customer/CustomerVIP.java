package com.jad.customer;

public class CustomerVIP extends AbstractDecoratorCustomer {
    public CustomerVIP(final ICustomer customer) {
        super(customer);
    }

    @Override
    protected void beforeBuy(final String item) {
        System.out.println("On applique une ristourne pour cette article : " + item);
    }

    @Override
    protected void afterBuy(final String item) {

    }

}
