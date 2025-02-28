package com.jin.javastudy.abstractAndInterface.interfaceTest;

public interface Restaurant extends Store {

    void cooking();
    default void breakTime(int hour) {
        System.out.println(hour + " 시 까지 재료 준비 중 입니다.");
    }

    void completeCooking();
}
