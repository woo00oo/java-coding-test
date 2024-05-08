package com.woo.programmers.lv2;

import java.util.Arrays;

/**
 * JadenCase 문자열 만들기
 */
public class Solution_04 {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        String[] array = s.split(" ");

        Arrays.stream(array).forEach(text -> {

           if (text.isEmpty() || checkNumeric(text.charAt(0))) {
               builder.append(text.toLowerCase()+ " ");
               return;
           }
           builder.append(capitalizeFistLetter(text) + " ");

        });
        String answer = builder.toString();
        if (answer.length() > s.length()) {
            return answer.substring(0, answer.length()-1);
        }
        return answer;
    }

    private boolean checkNumeric(char c) {
        try {
            Integer.parseInt(String.valueOf(c));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String capitalizeFistLetter(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

}
