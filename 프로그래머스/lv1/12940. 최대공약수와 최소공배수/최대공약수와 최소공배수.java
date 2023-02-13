class Solution {
    public int[] solution(int n, int m) {
        int min=0;
        int max=0;
        for(int i=1; i<=n;i++){
            if(n%i==0 && m%i==0){
                max=i;
            }
        }
        min=n*m/max;
        int[] answer = {max,min};
        return answer;
    }
}