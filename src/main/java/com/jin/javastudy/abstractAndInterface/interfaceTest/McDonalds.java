package com.jin.javastudy.abstractAndInterface.interfaceTest;

public class McDonalds implements Restaurant, Delivery{
    @Override
    public void sell() {
        System.out.println("햄버거 판매 시작!");
    }

    @Override
    public void refund() {
        System.out.println("환불은 개별 문의 부탁드립니다.");
    }

    @Override
    public void sale() {
        System.out.println("불고기 버거 세트 10% SALE");
    }


    @Override
    public void cooking() {
        System.out.println("조리중입니다.");
    }

    @Override
    public void breakTime(int hour) {
        System.out.println(hour + " 시까지 직원 식사 시간 입니다.");
    }

    @Override
    public void completeCooking() {
        System.out.println("주문하신 햄버거 나왔습니다!");
    }

    @Override
    public void receiveOrder() {
        System.out.println("배달 주문 접수 받았습니다.");
    }

    @Override
    public void startDelivery() {
        System.out.println("배달을 시작합니다.");
    }

    @Override
    public void completeDelivery() {
        System.out.println("배달이 완료되었습니다.");

    }

}
