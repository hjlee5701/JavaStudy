package com.jin.javastudy.objectClone;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DrinkItem implements Cloneable{

    private Cola cola;
    private String milkTea;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
