package com.woo.programmers.lv2;

/**
 * 이진 변환 반복하기
 */
public class Solution_05 {
    public int[] solution(String s) {
        int cnt1 = 0;       // 이진 변환의 횟수
        int cnt2 = 0;       // 제거된 모든 0의 개수

        while(!s.equals("1")) {
            // 0 제거
            String result = s.replace("0", "");
            int deletedCount = s.length() - result.length();

            // 이진수 변환
            int length = result.length();
            s = Integer.toBinaryString(length);

            cnt2 += deletedCount;
            cnt1 += 1;

        }

        int[] answer = {cnt1, cnt2};
        return answer;
    }
}
