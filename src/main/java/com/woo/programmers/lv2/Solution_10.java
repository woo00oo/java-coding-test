package com.woo.programmers.lv2;

/**
 * 카펫
 */
public class Solution_10 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow; // 전체 격자 수
        int sqrt = (int) Math.sqrt(total); // 전체 격자의 제곱근

        // 전체 카펫의 가로 길이와 세로 길이를 구함
        for (int height = 3; height <= sqrt; height++) {
            if (total % height == 0) {
                int width = total / height;
                int brownCount = 2 * width + 2 * (height - 2); // 갈색 격자의 수
                if (brownCount == brown) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }

        return answer;
    }
}
