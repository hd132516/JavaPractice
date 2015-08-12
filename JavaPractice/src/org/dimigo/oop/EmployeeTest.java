package org.dimigo.oop;

import java.io.PrintStream;

/**
 * EmployeeTest - Prints employee information
 *
 * Copyright (C) 2015 Therne. All rights are reserved.
 * @author Vista
 */
public class EmployeeTest {
    public static void main(String args[]) {
        // Initialization
        Employee e1 = new Employee("10001", "채치수", "영업팀", "과장", 41000000),
                 e2 = new Employee("10002", "정대만", "홍보팀", "대리", 37000000),
                 e3 = new Employee("10003", "송태섭", "인사팀"),
                 e4 = new Employee("10004", "서태웅", "회계팀"),
                 e5 = new Employee("10005", "강백호");

        // Print once
        e1.printEmployee();
        e2.printEmployee();
        e3.printEmployee();
        e4.printEmployee();
        e5.printEmployee();

        PrintStream out = System.out;
        out.println("--------------------------");
        out.printf("전체 연봉 총합 : %,d원\n\n",
                e1.getSalary() + e2.getSalary() + e3.getSalary() +
                        e4.getSalary() + e5.getSalary());

        // Increase all employee's salary by 5%
        e1.increaseSalary(5);
        e2.increaseSalary(5);
        e3.increaseSalary(5);
        e4.increaseSalary(5);
        e5.increaseSalary(5);

        // Print again
        e1.printEmployee();
        e2.printEmployee();
        e3.printEmployee();
        e4.printEmployee();
        e5.printEmployee();

        out.println("--------------------------");
        out.printf("전체 연봉 총합 : %,d원\n\n",
                e1.getSalary() + e2.getSalary() + e3.getSalary() +
                        e4.getSalary() + e5.getSalary());
    }
}
