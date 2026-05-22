package com.jad.customer;

public class Customer implements ICustomer {
    private final String firstName;
    private final String lastName;
    private final Integer id;
    private IBuy buyBehavior;

    public Customer(final String firstName, final String lastName, final Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.buyBehavior = (item) -> System.out.println(this.firstName + " " + this.lastName + " : J'achète " + item);
    }

    public IBuy getBuyBehavior() {
        return this.buyBehavior;
    }

    @Override
    public void setBuyBehavior(final IBuy buyBehavior) {
        this.buyBehavior = buyBehavior;
    }

    @Override
    public void buy(final String item) {
        this.buyBehavior.buy(item);
    }

    @FunctionalInterface
    public interface IBuy {
        void buy(String item);
    }
}
