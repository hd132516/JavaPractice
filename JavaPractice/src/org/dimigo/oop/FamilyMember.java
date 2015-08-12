package org.dimigo.oop;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class FamilyMember {
    private static int memberCnt;
    private String memberName;

    public static void printMemberCnt() {
        System.out.println("가족 총 인원수 : " + memberCnt + "명");
    }

    public FamilyMember(String memberName) {
        this.memberName = memberName;
        memberCnt++;
    }

    public String getMemberName() {
        return memberName;
    }
}
