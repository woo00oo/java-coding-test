package com.woo.programmers.lv1;

/**
 * 자연수 뒤집어 배열로 만들기
 */
public class Solution_05 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++){
            answer[s.length() -1 -i] = Character.getNumericValue(s.charAt(i));
        }
        return answer;
    }
}
