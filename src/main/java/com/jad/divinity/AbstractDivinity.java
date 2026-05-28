package com.jad.divinity;

import com.jad.person.*;

public abstract class AbstractDivinity {
    public abstract void visitPerson(Person person);

    public abstract void visitPerson(King king);

    public abstract void visitPerson(Peon peon);

    public abstract void visitPerson(Priest priest);

    public abstract void visitPerson(Pope pope);

    public abstract void visitPerson(Stranger stranger);

    public abstract void visitPerson(WineMerchant wineMerchant);
}
