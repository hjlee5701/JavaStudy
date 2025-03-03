package com.jin.javastudy.solid.ocp;

import java.util.Comparator;
import java.util.List;

public class Calculator {
    public void printEmployeeIncentive(boolean isJunior, boolean isSenior, List<Employee> employees) {

        employees.sort(Comparator.comparing(Employee::getName));

        double incentive;
        for (Employee employee : employees) {
            if (employee.isLazy()) {
                incentive = employee.getSalary() * 12 * 0.03;

            } else if (isJunior) {
                incentive = employee.getSalary() * 12 * 0.08;

            } else if (isSenior) {
                incentive = employee.getSalary() * 12 * 0.15;

            } else {
                incentive = employee.getSalary() * 12 * 0.05;
            }
            System.out.println(employee.getName() +"의 인센티브는 "+ incentive + "(원) 입니다.");
        }
    }
}