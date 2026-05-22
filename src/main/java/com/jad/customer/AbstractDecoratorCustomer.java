package com.jad.customer;

public abstract class AbstractDecoratorCustomer implements ICustomer {
    protected final ICustomer customer;

    public AbstractDecoratorCustomer(final ICustomer customer) {
        this.customer = customer;
    }

    @Override
    public void setBuyBehavior(final Customer.IBuy buyBehavior) {

    }

    @Override
    public void buy(final String item) {
        this.beforeBuy(item);
        this.customer.buy(item);
        this.afterBuy(item);
    }

    protected abstract void beforeBuy(final String item);

    protected abstract void afterBuy(final String item);
}
