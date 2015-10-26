package org.dimigo.collection;

import java.util.*;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class MelonGenreChart {
    public static void main(String[] args) {
        Map<String, List<Music>> map = new HashMap<>();

        List<Music> balad = new ArrayList<>(Arrays.asList(
                new Music("내 첫사랑", "베리굿"),
                new Music("또 다시 사랑", "임창정"),
                new Music("부산에 가면", "박진영")
        ));
        map.put("발라드", balad);

        List<Music> dance = new ArrayList<>(Arrays.asList(
                new Music("커피", "유재환,김예림"),
                new Music("다 잘될꺼야", "쿨")
        ));
        map.put("댄스", dance);

        System.out.println("-- << 멜론 장르별 차트 >> --");
        printMap(map);

        System.out.println("-- << 발라드 3위 곡 변경 >> --");
        balad.set(2, new Music("지우고 지워도", "차수경"));
        printMap(map);

        System.out.println("-- << 발라드 1위 곡 삭제 >> --");
        balad.remove(0);
        printMap(map);

        System.out.println("-- << 전체 리스트 삭제 >> --");
        map.clear();
        printMap(map);
    }

    public static void printMap(Map<String, List<Music>> map) {
        for (Map.Entry<String, List<Music>> entry : map.entrySet()) {
            System.out.println("[" + entry.getKey() + "]");

            int i = 1;
            for (Music music : entry.getValue()) System.out.println(i++ + ". " + music);
        }
    }
}
