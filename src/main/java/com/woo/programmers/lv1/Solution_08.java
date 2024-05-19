package com.woo.programmers.lv1;

/**
 * 정수 제곱근 판별
 */
public class Solution_08 {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if (sqrt == (int) sqrt) {
            return (long) Math.pow((int) sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}
