package com.jad.customer;

public interface ICustomer {
    void setBuyBehavior(Customer.IBuy buyBehavior);

    void buy(String item);
}
