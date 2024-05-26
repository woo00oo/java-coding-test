package com.woo.programmers.lv1;

/**
 * 서울에서 김서방 찾기
 */
public class Solution_14 {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return null;
    }
}
