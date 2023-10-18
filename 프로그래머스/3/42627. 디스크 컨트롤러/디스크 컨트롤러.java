import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs,(o1,o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> que = new PriorityQueue<>((o1,o2) -> o1[1]-o2[1]);
        
        int index= 0;
        int finish=0;
        int end_time=0;
        
        while(true){    
            if(jobs.length == finish){
                break;
            }
            
            while(index<jobs.length && jobs[index][0]<=end_time){
                que.add(jobs[index++]);
            }
            
            if(!que.isEmpty()){
                int job[] =que.poll();
                answer+=end_time-job[0]+job[1];
                end_time += job[1];
                finish++;
            }else{
                end_time = jobs[index][0];
            }
        }
        return answer/jobs.length;
    }
}