import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
         
        Arrays.sort(A);
        Arrays.sort(B);
        
        int b[]=new int[B.length];
        int a=0;
        
        for(int i=B.length-1;i>=0;i--){
            b[a++]=B[i];
        }
        
        for(int i=0;i<B.length;i++){
                answer+=A[i]*b[i];            
        }
        return answer;
    }
}