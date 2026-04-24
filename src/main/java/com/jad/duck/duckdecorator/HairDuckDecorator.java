package com.jad.duck.duckdecorator;

import com.jad.duck.IDuck;

public class HairDuckDecorator extends AbstractDuckDecorator {
    public HairDuckDecorator(final IDuck duckDecorated) {
        super(duckDecorated);
    }

    @Override
    protected String toPrettyStringDecorated(final String[] split) {
        char[] line = split[0].toCharArray();
        line[1] = '@';
        line[2] = '@';
        return "" + line[0] + line[1] + line[2] + line[3] + "\n" + split[1] + "\n" + split[2] + "\n";
    }
}
