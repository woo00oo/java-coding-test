package com.woo.programmers.lv2;

import java.util.Arrays;

/**
 * 최솟값
 */
public class Solution_03 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }

        return answer;
    }
}
