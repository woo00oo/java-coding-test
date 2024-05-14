package com.woo.programmers.lv2;

/**
 * 예상 대진표
 */
public class Solution_12 {
    public int solution(int n, int a, int b) {
        int round = 0;

        // A와 B가 같은 그룹에 속할 때까지 반복
        while (a != b) {
            a = (a + 1) / 2; // A가 속한 그룹의 다음 라운드 번호
            b = (b + 1) / 2; // B가 속한 그룹의 다음 라운드 번호
            round ++;
        }
        return  round;
    }
}
