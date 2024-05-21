package com.woo.programmers.lv1;

/**
 * 하샤드 수
 */
public class Solution_10 {
    public boolean solution(int x) {
        String num = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        return x % sum == 0;
    }
}
