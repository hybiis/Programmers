import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        
        Queue<Integer> que =new LinkedList <>();
        LinkedList<Integer> list =new LinkedList<>();
        
        for(int i=0;i<speeds.length;i++){
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int num = (int) Math.ceil(remain);
            //int num=(int)Math.ceil((100-progresses[i])/speeds[i]);
            
            if(!que.isEmpty() && que.peek() < num){
                list.add(que.size());  
                que.clear();
            } 
            
            que.offer(num);
        }
    
        list.add(que.size()); 
        
        int answer[] = new int[list.size()];
        
        for(int i=0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}