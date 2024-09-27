public class _509_Fibonacci_Number {
    private static int[] F = new int[31];

    public static int fib(int n) {
        F[0] = 0;
        F[1] = 1;

        for(int i=2 ; i<= n; i++){
            F[n] = F[n-1] + F[n-2];
        }

        return F[n];
    }

    public static int fibRecur(int n) {
        if(n==0){
            return 0;
        }

        if(n<=2){
            F[1]= 1;
            F[2] = 1;
            return 1;
        }

        F[n] = fibRecur(n-1) + fibRecur(n-2);
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println(fibRecur(4));
    }
}
