package com.jin.javastudy.solid.ocp.strategy;

import com.jin.javastudy.solid.ocp.Employee;

public interface IncentiveStrategy {
    double calculateIncentive(Employee employee);
}
