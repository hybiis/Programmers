import java.util.*;
class Solution {
    public int[] solution(int[] arr) {  
        int[] x={-1};
        int min=arr[0];
        ArrayList<Integer> alist =new ArrayList<Integer>();
        
        if(arr.length==1){
            return x;
        }//배열길이가 1이면 -1 반환
        for(int i=0;i<arr.length;i++){
            alist.add(arr[i]);
            if(min>arr[i]){
                min=arr[i];
            }
        }//최솟값 구하기 min
        alist.remove(Integer.valueOf(min));//최솟값 삭제하기
        
        int[] answer = new int[alist.size()];
         for (int i = 0 ; i < alist.size() ; i++) {
                answer[i] = alist.get(i).intValue();
            } //list->배열로 변환
        
        
        return answer;
    }
}