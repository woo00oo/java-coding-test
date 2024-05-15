package com.woo.programmers.lv1;

/**
 * 자릿수 더하기
 */
public class Solution_04 {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            answer += Character.getNumericValue(s.charAt(i));
        }
        return answer;
    }
}
