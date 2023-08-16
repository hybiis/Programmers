import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int i : scoville)
            que.offer(i);
        
        while(que.size() > 1 && que.peek() < K){
            int first = que.poll();
            int sec = que.poll();
            
            int mix = first + sec * 2;
            
            que.add(mix);
            
            answer++;
            
        }
        
        if(que.size() <= 1 && que.peek() < K)
            answer = -1;
        
        return answer;
    }
}