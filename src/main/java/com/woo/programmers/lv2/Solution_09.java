package com.woo.programmers.lv2;

import java.util.Stack;

/**
 * 짝지어 제거하기
 */
public class Solution_09 {
    /**
     * 효율성 X
     * 2중 For 문
     */
    public int solution(String s) {
        int answer = 0;

        while (!s.isEmpty()) {
            boolean chk = false;
            for (int i = 0; i < s.length()-1; i++) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    s = s.substring(0, i) + s.substring(i+2);
                    chk = true;
                    break;
                }
            }
            if(!chk) {
                break;
            }
        }

        if (s.isEmpty()) {
            answer = 1;
        }

        return answer;
    }
    /**
     * 스택 자료 구조를 활용
     */
    public int solution_2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
