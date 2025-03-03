package com.jin.javastudy.solid.ocp.strategy;

import com.jin.javastudy.solid.ocp.Employee;

public class LazyIncentiveStrategy implements IncentiveStrategy {

    @Override
    public double calculateIncentive(Employee employee) {
        return employee.getSalary() * 12 * 0.03;
    }
}