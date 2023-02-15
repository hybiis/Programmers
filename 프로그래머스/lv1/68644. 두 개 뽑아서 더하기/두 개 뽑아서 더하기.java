import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> alist =new ArrayList<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int temp=numbers[i]+numbers[j];
                if(!alist.contains(temp)){
                    alist.add(temp);
                }
            }
        }
        
        int size=0;
        int[] answer = new int [alist.size()];
        
        for(int num:alist){
            answer[size++]=num;
        }
        Arrays.sort(answer);
        return answer;
    }
}