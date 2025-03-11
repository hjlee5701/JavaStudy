package com.jin.javastudy.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMain {
    public static void main(String[] args) {
        System.out.println("\n==========================");
        doublePrecisionProblem();

        System.out.println("\n==========================");
        bigDecimalSuccess();

        System.out.println("\n==========================");
        bigDecimalExample();

        System.out.println("\n==========================");
        bigDecimalCompare();

        System.out.println("\n==========================");
        bigDecimalCalculation();
    }

    private static void doublePrecisionProblem() {
        double a = 0.1;
        double b = 0.2;
        double sum = a + b; // 0.30000000000000004
        System.out.println("0.1 + 0.2 은 0.3 인가? -> " + (sum == 0.3));
    }


    private static void bigDecimalSuccess() {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal bd3 = new BigDecimal("0.3");

        BigDecimal result = bd1.add(bd2);

        System.out.println("0.1 + 0.2 은 0.3 인가? -> " + (result.equals(bd3)));
    }


    private static void bigDecimalExample() {
        BigDecimal bd1 = new BigDecimal(0.1);   // 부정확한 값 저장
        BigDecimal bd2 = new BigDecimal("0.1"); // 정확한 값 저장
        BigDecimal bd3 = BigDecimal.valueOf(0.1);   // 권장 방법

    }

    private static void bigDecimalCompare() {
        BigDecimal bd1 = BigDecimal.valueOf(0.3);
        BigDecimal bd2 =  new BigDecimal("0.30");

        boolean equalResult = bd1.equals(bd2);
        int compareResult = bd1.compareTo(bd2);
        System.out.println("equalResult = " + equalResult);
        System.out.println("compareResult = " + compareResult); // 0 = true
    }


    private static void bigDecimalCalculation() {
        BigDecimal bd1 = BigDecimal.valueOf(0.4);
        BigDecimal bd2 = BigDecimal.valueOf(0.2);

        BigDecimal add = bd1.add(bd2);
        BigDecimal sub = bd1.subtract(bd2);
        BigDecimal mul = bd1.multiply(bd2);
        BigDecimal div = bd1.divide(bd2, RoundingMode.DOWN);

        System.out.println("add = " + add); // 0.6
        System.out.println("sub = " + sub); // 0.2
        System.out.println("mul = " + mul); // 0.08
        System.out.println("div = " + div); // 2.0

    }

}
