package com.jin.javastudy.abstractAndInterface.interfaceTest;

public class InterfaceMain {
    public static void main(String[] args) {
        Restaurant mcDonalds = new McDonalds();
        Restaurant iceCreamTruck = new IceCreamTruck();

        Store.printStoreName("맥도날드");
        System.out.println("===== "+Store.OPEN+" =====");
        mcDonalds.sell();
        mcDonalds.sale();
        mcDonalds.refund();
        mcDonalds.breakTime(5);
        mcDonalds.cooking();
        mcDonalds.completeCooking();
        System.out.println("===== "+Store.CLOSED+" =====\n");

        Store.printStoreName("아이스크림 트럭");
        System.out.println("===== "+Store.OPEN+" =====");
        iceCreamTruck.sell();
        iceCreamTruck.sale();
        iceCreamTruck.refund();
        iceCreamTruck.breakTime(6);
        iceCreamTruck.cooking();
        iceCreamTruck.completeCooking();
        System.out.println("===== "+Store.CLOSED+" =====\n");

        Delivery deliverMc = (Delivery) mcDonalds;
        System.out.println("===== "+Store.OPEN+" =====");
        deliverMc.receiveOrder();
        deliverMc.startDelivery();
        deliverMc.completeDelivery();
        System.out.println("===== "+Store.CLOSED+" =====\n");

    }
}
