package com.jin.javastudy.abstractAndInterface.interfaceTest;

public class IceCreamTruck implements Restaurant {
    @Override
    public void sell() {
        System.out.println("아이스크림 판매 시작!");
    }

    @Override
    public void refund() {
        System.out.println("환불을 원하시는 경우 별도 문의 부탁드립니다.");
    }

    @Override
    public void sale() {
        System.out.println("초콜릿 아이스크림 10% 할인합니다.");
    }

    @Override
    public void cooking() {
        System.out.println("아이스크림 담는 중입니다.");
    }

    @Override
    public void completeCooking() {
        System.out.println("주문하신 아이스크림 나왔습니다!");
    }
}
