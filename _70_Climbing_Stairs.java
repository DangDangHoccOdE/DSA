public class _70_Climbing_Stairs {
   public static int[] F = new int[46];

    public static int climbStairs(int n) {
        if(F[n]!=0){
            return F[n];
        }
        if (n <= 3) {
            F[1]=1;
            F[2] =2;
            F[3]=3;
            return n;
        }
        F[n] = climbStairs(n-1)+climbStairs(n-2);
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(8));
    }
}
// 1-> 1 2->2 3->3 4->5 5: 11111 1211 1121 1112 2111 122 221 212-> 8