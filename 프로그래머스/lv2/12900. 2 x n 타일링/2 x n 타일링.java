class Solution {
   private static int[] D;

    public static int solution(int n) {
        D = new int[n+1];
        D[1] = 1;
        D[2] = 2;

        for (int i = 3; i <= n; i++) {
            D[i] = (D[i - 1] + D[i - 2]) % 1_000_000_007;
        }

        return D[n];
    }

}