import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int index=0;
        int arr[]=new int[score.length/m];
        Arrays.sort(score);
        
        for(int i=0;i<score.length/2;i++){
            int temp=score[i];
            score[i]=score[score.length-i-1];
            score[score.length-i-1]=temp;
        }
        
        for(int i=m-1;i<score.length;i+=m){
            arr[index++]=score[i];
        }
        
        for(int j=0;j<arr.length;j++){
            answer+=arr[j]*m;
        }
        
        return answer;
    }
}