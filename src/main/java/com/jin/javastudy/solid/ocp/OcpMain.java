package com.jin.javastudy.solid.ocp;

import com.jin.javastudy.solid.ocp.strategy.EmployeeLevel;
import com.jin.javastudy.solid.ocp.strategy.InternIncentiveStrategy;
import com.jin.javastudy.solid.ocp.strategy.JuniorIncentiveStrategy;
import com.jin.javastudy.solid.ocp.strategy.LazyIncentiveStrategy;

import java.util.ArrayList;
import java.util.List;

public class OcpMain {
    public static void main(String[] args) {
        Employee lazy = new Employee("송직원", 200, true, EmployeeLevel.INTERN);
        Employee intern = new Employee("이직원", 200, false, EmployeeLevel.INTERN);
        Employee junior1 = new Employee("김직원", 250, false, EmployeeLevel.JUNIOR);
        Employee junior2 = new Employee("최직원", 250, false, EmployeeLevel.JUNIOR);
        Employee senior1 = new Employee("신직원", 400, false, EmployeeLevel.SENIOR);
        Employee senior2 = new Employee("박직원", 300, false, EmployeeLevel.SENIOR);

        Calculator lazyIncen = new Calculator(new LazyIncentiveStrategy());
        Calculator internIncen = new Calculator(new InternIncentiveStrategy());
        Calculator juniorIncen = new Calculator(new JuniorIncentiveStrategy());
        Calculator seniorIncen = new Calculator(new SeniorIncentiveStrategy());

        System.out.println("\n========= LAZY =========");
        lazyIncen.printEmployeeIncen(new ArrayList<>(List.of(lazy)));

        System.out.println("\n=========" + EmployeeLevel.INTERN +" =========");
        internIncen.printEmployeeIncen(new ArrayList<>(List.of(intern)));

        System.out.println("\n=========" + EmployeeLevel.JUNIOR +" =========");
        juniorIncen.printEmployeeIncen(new ArrayList<>(List.of(junior1, junior2)));

        System.out.println("\n=========" + EmployeeLevel.SENIOR +" =========");
        seniorIncen.printEmployeeIncen(new ArrayList<>(List.of(senior1, senior2)));

    }
}
