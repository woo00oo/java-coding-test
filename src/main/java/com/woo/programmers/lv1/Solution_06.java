package com.woo.programmers.lv1;

import java.util.Arrays;

/**
 * 정수 내림차순으로 배치하기
 */
public class Solution_06 {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        int[] array = new int[s.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(array);

        for (int i = array.length - 1; i > -1; i--) {
            answer = answer * 10 + array[i];
        }

        return answer;
    }
}
