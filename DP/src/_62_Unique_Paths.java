public class _62_Unique_Paths {
//    public static int uniquePaths(int m, int n) {
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                dp[i][j] = -1; // Khởi tạo = -1
//            }
//        }
//       return countPaths(m,n,0,0,dp);
//    }
//
//    public static int countPaths(int m, int n,int i,int j,int[][] dp) {
//        if(i == m-1 && j== n-1){
//            return 1;
//        }
//
//        if(i >= m || j >= n){
//            return 0;
//        }
//
//        if(dp[i][j] != -1){
//            return dp[i][j];
//        }
//
//        int a = countPaths(m,n,i+1,j,dp);
//        int b = countPaths(m,n,i,j+1,dp);
//
//        dp[i][j] = a+b;
//        return dp[i][j];
//    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }
}
