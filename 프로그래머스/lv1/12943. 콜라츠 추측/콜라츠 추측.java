class Solution {
    public int solution(int num) {
        int count = 0;
        long num2 = Long.valueOf(num);
       if(num==1){
           return 0;
       }  
        
       while(num2>1){
         if(num2%2==0){
            num2=num2/2;
            count++;
        }else{
            num2=num2*3+1;
             count++;
            }                   
       }  
        if(count>=500){
            return -1;
        }
       return count;
    }
}