class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int arr[]=new int[a.length];
        
        for(int i=0;i<a.length;i++){
            arr[i]=a[i]*b[i];
        }
        for(int i=0;i<a.length;i++){
            answer+=arr[i];
        }
        return answer;
    }
}