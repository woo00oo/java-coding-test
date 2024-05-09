package com.woo.programmers.lv2;

/**
 * 숫자의 표현
 */
public class Solution_06 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int start = 1;

        for (int i = 1; i <= n; i++) {
            sum += i;

            while (sum > n) {
                sum -= start++;
            }

            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }
}
