package com.woo.programmers.lv2;

/**
 * 점프와 순간 이동
 */
public class Solution_16 {
    public int solution(int n) {
        int batteryUsage = 0;

        while (n > 0) {
            // N이 홀수라면 1만큼 점프하여 짝수로 만들어줌
            if (n % 2 != 0) {
                batteryUsage += 1;
                n -= 1;
            }
            // N이 짝수라면 순간이동 가능
            n /= 2;
        }

        return batteryUsage;
    }
}
