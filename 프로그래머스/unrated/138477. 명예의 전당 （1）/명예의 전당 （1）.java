import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> qu = new PriorityQueue <>();
        int a=0;
        
        for(int i:score){
            qu.add(i);           
            if(qu.size()>k){
                qu.poll();     
            }
             answer[a++]=qu.peek();  
        }
        
        return answer;
    }
}