import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        LinkedList<Integer> list =new LinkedList<>();
        
        PriorityQueue <Integer> minQue = new PriorityQueue<>();
        PriorityQueue <Integer> maxQue = new PriorityQueue<>(Collections.reverseOrder());
        
        int count=0; 
        
        for(int i=0;i<operations.length;i++){         
            if(operations[i].charAt(0)=='I'){
                
                list.add(Integer.valueOf(operations[i].substring(2)));
                minQue.add(list.get(count));
                maxQue.add(list.get(count));
                count++;
            }else if(operations[i].equals("D -1")){
                if(minQue.isEmpty() || maxQue.isEmpty()) continue;
                int k = minQue.poll();
                maxQue.remove(k);
            }else{  
                if(minQue.isEmpty() || maxQue.isEmpty()) continue;
                int j = maxQue.poll();
                minQue.remove(j);               
            }
        }
        
        if(minQue.size() == 0){
            answer[0]=0;
            answer[1]=0;
        }else{
            answer[0]=maxQue.poll();
            answer[1]=minQue.poll();
        }
 
        
        return answer;
    }
}