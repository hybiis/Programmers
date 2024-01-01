import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>(); 
        
        for(int i=0;i<scoville.length;i++){
            que.add(scoville[i]);
        }
        
        while(que.peek()<K && que.size()>1){
            int min = que.poll();
    
            int num = min + (que.poll()*2);
            que.add(num);
            answer++;
        
        }

        if(que.size()<=1 && que.peek()<K) return -1;
        return answer;
    }
}