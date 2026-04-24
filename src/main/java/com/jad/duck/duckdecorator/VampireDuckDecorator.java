package com.jad.duck.duckdecorator;

import com.jad.duck.IDuck;

public class VampireDuckDecorator extends AbstractDuckDecorator {
    public VampireDuckDecorator(final IDuck duckDecorated) {
        super(duckDecorated);
    }

    @Override
    protected String quackDecorated(final String quack) {
        return super.quackDecorated(quack) + "sss..";
    }

    @Override
    protected String toPrettyStringDecorated(final String[] split) {
        char[] line = split[2].toCharArray();
        line[1] = '\'';
        line[2] = '\'';
        return split[0] + "\n" + split[1] + "\n" + line[0] + line[1] + line[2] + line[3] + "\n";
    }
}
