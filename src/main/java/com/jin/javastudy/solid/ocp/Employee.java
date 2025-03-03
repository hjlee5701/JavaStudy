package com.jin.javastudy.solid.ocp;

import com.jin.javastudy.solid.ocp.strategy.EmployeeLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Employee {
    private String name;
    private int salary;
    private boolean isLazy;
    private EmployeeLevel employeeLevel;

}
