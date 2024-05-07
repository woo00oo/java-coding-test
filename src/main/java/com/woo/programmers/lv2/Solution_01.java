package com.woo.programmers.lv2;

import java.util.Arrays;

/**
 * 최댓값과 최솟값
 */
public class Solution_01 {
    public String solution(String s) {
        String[] array = s.split(" ");
        int[] intArray = Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Arrays.stream(intArray).min().getAsInt();
        int max = Arrays.stream(intArray).max().getAsInt();

        return min + " " + max;
    }
}
