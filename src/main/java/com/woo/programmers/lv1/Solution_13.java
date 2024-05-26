package com.woo.programmers.lv1;

/**
 * 두 정수 사이의 합
 */
public class Solution_13 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a == b) {
            return a;
        }

        int n1 = Math.min(a, b);
        int n2 = Math.max(a, b);

        for (int i = n1; i <= n2; i++) {
            answer += i;
        }

        return answer;
    }
}
