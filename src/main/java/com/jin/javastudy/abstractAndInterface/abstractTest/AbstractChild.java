package com.jin.javastudy.abstractAndInterface.abstractTest;

import lombok.Getter;

@Getter
public class AbstractChild extends AbstractParent {

    AbstractChild(String grandField, String parentField, String childField) {
        super(grandField, parentField);
        this.childField = childField;
    }
    private final String childField;

    // 필수
    @Override
    public void methodA() {
        System.out.println("From AbstractGrand");

    }

    // 선택 사항 (재정의)
    @Override
    public void methodB() {
        System.out.println("From AbstractGrand");
    }

    // 필수
    @Override
    void methodC() {
        System.out.println("From AbstractParent");
    }
}
