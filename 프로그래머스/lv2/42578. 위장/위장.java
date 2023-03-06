import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> total = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
            total.put(clothes[i][1],total.getOrDefault(clothes[i][1],1)+1);
        }
        Collection<Integer> test = total.values();
        answer = test.stream().reduce(1, (a, b) -> a*b) - 1;
        return answer;}}