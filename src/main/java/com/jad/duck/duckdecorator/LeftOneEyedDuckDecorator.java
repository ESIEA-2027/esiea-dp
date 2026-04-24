package com.jad.duck.duckdecorator;

import com.jad.duck.IDuck;

public class LeftOneEyedDuckDecorator extends AbstractDuckDecorator {
    public LeftOneEyedDuckDecorator(final IDuck duckDecorated) {
        super(duckDecorated);
    }

    @Override
    protected String toPrettyStringDecorated(final String[] split) {
        char[] line = split[1].toCharArray();
        line[1] = 'x';
        return split[0] + "\n" + line[0] + line[1] + line[2] + line[3] + "\n" + split[2] + "\n";
    }
}
