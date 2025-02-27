package com.jin.javastudy.abstractAndInterface.abstractTest;

import lombok.Getter;

@Getter
abstract class AbstractGrand {

    AbstractGrand(String grandField) {
        this.grandField = grandField;
    }

    /* 필드 */
    private final String grandField;                // (1) 상수 필드
    protected static final int STATIC_FIELD = 100;  // (2) 상수 필드


    /* 메소드 */
    public abstract void methodA();        // (3) 추상 메소드
    public void methodB() {         // (4) 일반 메소드
        System.out.println("AbstractGrand.methodB");
    }
}
