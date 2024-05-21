package com.woo.programmers.lv1;

import java.util.Arrays;

/**
 * 평균 구하기
 */
public class Solution_09 {
    public double solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return (double) sum / arr.length;
    }
}
