import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = i - map.getOrDefault(c,i+1);
            map.put(c, i); // 문자의 마지막 위치 업데이트
        }

        return answer;
    }
}

