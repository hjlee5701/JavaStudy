package com.jin.javastudy.abstractAndInterface.interfaceTest;

public interface Store {
    String OPEN = "영업 시작";
    String CLOSED = "영업 종료";

    static void printStoreName (String storeName) {
        System.out.println(">>>>> "+storeName+" <<<<<");
    }
    void sell();
    void refund();
    void sale();
}
