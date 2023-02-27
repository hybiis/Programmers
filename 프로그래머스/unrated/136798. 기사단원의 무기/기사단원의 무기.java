class Solution {
    public int solution(int number, int limit, int power) {
        int count[]=new int[number+1];
        
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number/i;j++){
                count[i*j]++;
            }
        }
        int answer = 0;
        
        for(int i=1;i<count.length;i++){
            if(count[i]>limit){
                count[i]=power;
                answer+=count[i];
            }else{
                answer+=count[i];
            }
        }
        return answer;
    }
}