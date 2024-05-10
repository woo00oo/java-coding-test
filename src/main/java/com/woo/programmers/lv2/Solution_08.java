package com.woo.programmers.lv2;

/**
 * 피보나치 수
 */
public class Solution_08 {
    public int solution(int n) {
        int n1 = 0;
        int n2 = 1;
        int answer = 0;

        for(int i = 2; i <= n; i++) {
            answer = n1 + n2;
            n1 = n2;
            n2 = answer;
        }

        return answer % 1234567;
    }
}
