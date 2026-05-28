package com.jad;

import com.jad.divinity.AbstractDivinity;
import com.jad.divinity.Angel;
import com.jad.person.*;

import java.util.ArrayList;
import java.util.List;

public enum Main {
    ;

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new King("Louis XIV", new Country("France", 67000000)));
        people.add(new Peon("Jean", 5));
        people.add(new Pope("Francis", new Country("Vatican City", 800)));
        people.add(new Priest("Frère Jacques", new Diocese("Paris", 2000000)));
        people.add(new Stranger("John Doe"));
        people.add(new WineMerchant("Pierre", 12345678));

        AbstractDivinity angel = new Angel();
        for (Person person : people) {
            angel.visitPerson(person);
        }
    }
}