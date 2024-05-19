package com.woo.programmers.lv1;

/**
 * 짝수와 홀수
 */
public class Solution_07 {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
