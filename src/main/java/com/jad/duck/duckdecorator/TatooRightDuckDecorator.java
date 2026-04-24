package com.jad.duck.duckdecorator;

import com.jad.duck.IDuck;

public class TatooRightDuckDecorator extends AbstractDuckDecorator {
    public TatooRightDuckDecorator(final IDuck duckDecorated) {
        super(duckDecorated);
    }

    @Override
    protected String toPrettyStringDecorated(final String[] split) {
        char[] line = split[1].toCharArray();
        line[3] = '#';
        return split[0] + "\n" + line[0] + line[1] + line[2] + line[3] + "\n" + split[2] + "\n";
    }
}
