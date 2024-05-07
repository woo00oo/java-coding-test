package com.woo.programmers.lv2;

import java.util.Stack;

/**
 * 올바른 괄호
 */
public class Solution_02 {
    public boolean solution(String s) {
        try {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char character = s.charAt(i);
                if (character == '(') {
                    stack.push(character);
                }else {
                    stack.pop();
                }
            }
            return stack.isEmpty();
        } catch (Exception e) {
            return false;
        }
    }
}
