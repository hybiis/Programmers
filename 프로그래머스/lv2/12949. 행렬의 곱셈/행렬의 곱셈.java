class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {   
        int ROW	 = arr1.length;
		int COL	 = arr2[0].length;
		int M2_ROW = arr2.length;

		int[][] answer = new int[ROW][COL];


		for(int i = 0 ; i < ROW ; i++) {
			for(int j = 0 ; j < COL ; j++) {
				for(int k = 0 ; k < M2_ROW ; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		return answer;
    }
}