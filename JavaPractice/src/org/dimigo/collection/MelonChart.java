package org.dimigo.collection;

import java.util.*;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class MelonChart {
    public static void main(String[] args) {

        List<Music> chart = new ArrayList<>(Arrays.asList(
                new Music("내 첫사랑", "베리굿"),
                new Music("또 다시 사랑", "임창정"),
                new Music("부산에 가면", "박진영")
        ));

        System.out.println("-- << 멜론 차트 >> --");
        printList(chart);

        System.out.println("-- << 발라드 3위 곡 변경 >> --");
        chart.add(1, new Music("나의 슬픔", "김용석"));
        printList(chart);

        System.out.println("-- << 발라드 1위 곡 삭제 >> --");
        printList(chart);
    }

    public static void printList(List<Music> list) {
        int i=1;
        for (Music music : list) System.out.println(i++ + ". " + music);
    }
}
