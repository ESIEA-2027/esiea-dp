package com.jad.person;

import com.jad.divinity.AbstractDivinity;

public interface Person {
    String getName();

    SocialStatus getSocialStatus();

    void visitedBy(AbstractDivinity divinity);
}
