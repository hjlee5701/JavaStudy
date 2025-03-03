package com.jin.javastudy.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class OcpMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Employee employee1 = new Employee("진자라", 200, false);
        Employee employee2 = new Employee("이진진", 300, true);
        calculator.printEmployeeIncentive(false, true, new ArrayList<>(List.of(employee1, employee2)));
    }
}
