class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count=0;
        int count2=0;
        s=s.toUpperCase();
        
        String arr[]=s.split("");

        for(String a:arr){
            if(a.equals("P")){count++;}
            else if(a.equals("Y")){
                count2++;
            }
        }
        if(count==count2 || (count==0&&count2==0)){
            answer= true;
        }else{answer=false;}
        return answer;
    }
}