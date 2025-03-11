package com.jin.javastudy.solid.lsp;

public class LspMain {
    public static void main(String[] args) {
        System.out.println("\n==== 부모(Rectangle) 클래스 ====");
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("넓이 = " + rectangle.area());

        System.out.println("\n===== 자식(Square) 으로 대체 ====");
        Shape square = new Square(4);

        System.out.println("넓이 = " + square.area());

        System.out.println("\n====== 동일한 결과 값 인가? ======");
        System.out.println(rectangle.area() == square.area() );
    }
}
