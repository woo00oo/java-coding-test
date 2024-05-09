package com.woo.programmers.lv2;

/**
 * 다음 큰 숫자
 */
public class Solution_07 {
    public int solution(int n) {
        int num = 1;

        while(true) {

            String s = Integer.toBinaryString(n);
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    count += 1;
                }
            }

            String s1 = Integer.toBinaryString(n + num);
            int count2 = 0;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == '1') {
                    count2 += 1;
                }
            }

            if (count == count2) {
                return n + num;
            }

            num += 1;
        }
    }
}
