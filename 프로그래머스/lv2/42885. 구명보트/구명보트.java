import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
         List<Integer> list = new ArrayList<>();
        
        for(int i: people){
            list.add(i);
        }
        Collections.sort(list);
        
        ArrayDeque <Integer> dp =new ArrayDeque<>(50000);
        
        for(int x:list){
            dp.add(x);
        }
        
        while(dp.isEmpty() == false){
            int weight = dp.pollLast();
            if(dp.isEmpty() == false && weight+dp.peekFirst()<=limit){
                dp.pollFirst();
            }
            answer++;
        }
        
        
        return answer;
    }
}