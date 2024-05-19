package com.woo.programmers.lv2;

import java.util.HashSet;
import java.util.Set;

/**
 * 영어 끝말잇기
 */
public class Solution_15 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            // 마지막 문자로 시작하는 단어 여부 확인
            if (words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)) {
                // 연속된 단어 여부 확인
                if(!set.contains(words[i])) {
                    set.add(words[i]);
                    continue;
                }

            }
            answer[0] = i % n + 1;
            answer[1] = i / n + 1;
            break;
        }

        return answer;
    }
}
