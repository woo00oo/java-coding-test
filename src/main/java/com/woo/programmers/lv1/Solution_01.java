package com.woo.programmers.lv1;

/**
 * 문자열 내 p와 y의 개수
 */
public class Solution_01 {
    public boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') {
                pCount += 1;
            } else if (s.charAt(i) == 'Y') {
                yCount += 1;
            }
        }

        return pCount == yCount;
    }
}
