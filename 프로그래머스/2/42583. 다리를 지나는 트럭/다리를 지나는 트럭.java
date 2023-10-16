import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sec = 1;
        int now =0;
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int w : truck_weights){
            
            if(!map.isEmpty() && map.firstKey()==sec){
                now-=map.remove(map.firstKey());
            }
            
            while(now+w>weight){
                sec = map.firstKey();
                now-=map.remove(map.firstKey());
            }
            
            map.put(sec+bridge_length, w);
            
            now+=w;
            sec++;
        }
        
        return map.lastKey();
    }
}