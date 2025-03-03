package com.jin.javastudy.solid.ocp;

import com.jin.javastudy.solid.ocp.strategy.IncentiveStrategy;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.List;

@RequiredArgsConstructor
public class Calculator {
    private final IncentiveStrategy incentiveStrategy;
    public void printEmployeeIncen(List<Employee> employees) {

        employees.sort(Comparator.comparing(Employee::getName));

        double incentive;
        for (Employee employee : employees) {
            incentive = incentiveStrategy.calculateIncentive(employee);
            System.out.println(employee.getName() +"의 인센티브는 "+ incentive + "(만원) 입니다.");
        }

    }
}