package org.dimigo.oop;

import java.io.PrintStream;

/**
 * Student - The Abstraction of the student information
 * @author Vista
 */
public class Student {
    private int gisu;
    private int grade;
    private int ban;
    private int number;
    private String name;
    private String address;
    private String phone;

    public Student(int gisu, int grade, int ban, int number) {
        this(gisu, grade, ban, number, "이름없음");
    }

    public Student(int gisu, int grade, int ban, int number, String name) {
        this(gisu, grade, ban, number, name, "주소없음");
    }

    public Student(int gisu, int grade, int ban, int number, String name, String address) {
        this(gisu, grade, ban, number, name, address, "휴대폰없음");
    }

    public Student(int gisu, int grade, int ban, int number, String name, String address, String phone) {
        this.gisu = gisu;
        this.grade = grade;
        this.ban = ban;
        this.number = number;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void printStudent() {
        PrintStream out = System.out;
        out.println("<< 학생 정보 출력 >>");
        out.printf("1. 학번 : %02d%d%d%02d\n", gisu, grade, ban, number);
        out.println("2. 이름 : " + name);
        out.println("3. 주소 : " + address);
        out.println("4. 휴대폰번호 : " + phone);
    }
}
