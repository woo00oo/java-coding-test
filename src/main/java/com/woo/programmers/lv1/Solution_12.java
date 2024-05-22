package com.woo.programmers.lv1;

/**
 * 나머지가 1이 되는 수 찾기
 */
public class Solution_12 {
    public int solution(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}
