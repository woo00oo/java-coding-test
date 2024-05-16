package com.woo.programmers.lv2;

import java.util.Arrays;

/**
 * 구명 보트
 */
public class Solution_13 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        int max = people.length - 1;

        // 오름차순으로 정렬
        Arrays.sort(people);

        while(min <= max) {
            if (people[min] + people[max] > limit) {
                max -= 1;
                answer += 1;
            } else if (people[min] + people[max] <= limit) {
                max -= 1;
                min += 1;
                answer += 1;
            }
        }
        return answer;
    }
}
