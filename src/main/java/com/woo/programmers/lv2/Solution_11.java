package com.woo.programmers.lv2;

/**
 * N개의 최소공배수
 */
public class Solution_11 {
    // 최대 공약수 계산 메소드
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소 공배수 계산 메소드
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 배열의 최소공배수 계산하는 함수
    public static int solution(int[] arr) {
        int lcmResult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcmResult = lcm(lcmResult, arr[i]);
        }
        return lcmResult;
    }
}
