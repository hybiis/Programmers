import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue <Integer> pq =new PriorityQueue<>();
        int count=0;
        
        for(int i: scoville){
            pq.add(i);
        }
        
        while(pq.peek()<K && pq.size()>1){
            pq.add(pq.remove()+pq.remove()*2);
            count++;
        }
        
        return pq.peek()>=K?count:-1;
    }
}