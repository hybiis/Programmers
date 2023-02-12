import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> alist=new ArrayList<Integer>();
        int [] x={-1};
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                alist.add(arr[i]);
                count++;
            }
        }
        if(count==0){
            return x;
        }
         int[] answer = new int[alist.size()];
         for (int i = 0 ; i < alist.size() ; i++) {
                answer[i] = alist.get(i).intValue();
            }
 
        Arrays.sort(answer);

        return answer;
    }
}