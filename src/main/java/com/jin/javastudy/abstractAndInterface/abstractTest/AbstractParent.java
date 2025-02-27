package com.jin.javastudy.abstractAndInterface.abstractTest;

import lombok.Getter;

@Getter
abstract class AbstractParent extends AbstractGrand {

    AbstractParent(String grandField, String parentField) {
        super(grandField);
        this.parentField = parentField;
    }



    private final String parentField;
    abstract void methodC();
}