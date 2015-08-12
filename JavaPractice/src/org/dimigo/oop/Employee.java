package org.dimigo.oop;

import java.io.PrintStream;

/**
 * Employee - Abstraction of the WeMake Corp Employee Info.
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Employee {
    private static final String DEFAULT_DEP = "개발팀";
    private static final String DEFAULT_POS = "사원";
    private static final int DEFAULT_SAL = 32000000;

    private String id, name;
    private String department;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name) {
        this(id, name, DEFAULT_DEP);
    }

    public Employee(String id, String name, String department) {
        this(id, name, department, DEFAULT_POS);
    }

    public Employee(String id, String name, String department, String position) {
        this(id, name, department, position, DEFAULT_SAL);
    }

    public Employee(String id, String name, String department, String position, int salary) {
        this.id = id;
        this.name = name;
        if (department != null) this.department = department;
        if (position != null) this.position = position;
        if (salary != -1) this.salary = salary;
    }

    /**
     * Sets employee salary.
     * @param salary Salary (>=0)
     */
    public void setSalary(int salary) {
        if (salary >= 0) this.salary = salary;
    }

    /**
     * Increases employee salary by rate.
     * @param rate Increase rate
     */
    public void increaseSalary(int rate) {
        salary = salary + (salary / 100 * rate);
    }

    /**
     * Prints employee information.
     */
    public void printEmployee() {
        PrintStream out = System.out;
        out.println("<< 직원 정보 출력 >>");
        out.println("사번 : " + id);
        out.println("이름 : " + name);
        out.println("부서 : " + department);
        out.println("직급 : " + position);
        out.printf("연봉 : %,d원\n\n", salary);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }
}
