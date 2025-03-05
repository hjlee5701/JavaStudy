package com.jin.javastudy.solid.ocp.lsp;

public class LspMain {
    public static void main(String[] args) {
        System.out.println("\n==== 부모(Rectangle) 클래스 ====");
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println("넓이 = " + rectangle.area());

        System.out.println("\n===== 자식(Square) 으로 대체 ====");
        Rectangle square = new Square();
        square.setWidth(4);
        square.setHeight(5);

        System.out.println("넓이 = " + square.area());

        System.out.println("\n====== 동일한 결과 값 인가? ======");
        System.out.println(rectangle.area() == square.area() );
    }
}
