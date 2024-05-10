package com.woo.programmers.lv2;

/**
 * 피보나치 수
 */
public class Solution_08 {
    public int solution(int n) {
        final int MOD = 1234567;
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % MOD;
        }

        return fibo[n];
    }
}
