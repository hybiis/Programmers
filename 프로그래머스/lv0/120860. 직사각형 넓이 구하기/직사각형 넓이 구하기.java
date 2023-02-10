class Solution {
    public int solution(int[][] dots) {
        int s1=0;
        int s2=0;
        int answer = 0;
        int arr[] =new int[dots.length*dots[0].length];
        
        for(int i=0; i< dots.length;i++){   
            for(int j=0;j<dots[i].length;j++){
                arr[dots[i].length*i+j]=dots[i][j];
            }
        }  
        int max=arr[0];
        int min =arr[0];
        for(int i=0;i<arr.length;i+=2){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int max2=arr[1];
        int min2 =arr[1];
        for(int i=1;i<arr.length;i+=2){
            if(max2<arr[i]){
                max2=arr[i];
            }
            if(min2>arr[i]){
                min2=arr[i];
            }
        }
            s1=max-min;
            s2=max2-min2;      
        answer=s1*s2;
        
        return answer;
    }
}