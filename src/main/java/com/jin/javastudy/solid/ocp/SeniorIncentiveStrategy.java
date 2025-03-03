package com.jin.javastudy.solid.ocp;

import com.jin.javastudy.solid.ocp.strategy.IncentiveStrategy;

public class SeniorIncentiveStrategy implements IncentiveStrategy {

    @Override
    public double calculateIncentive(Employee employee) {
        return employee.getSalary() * 12 * 0.15;
    }
}
