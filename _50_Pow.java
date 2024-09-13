public class _50_Pow {
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }

        int n_2=0;
        if(n>0){
            n_2= (n%2==0)?(n/2):((n-1)/2);
        }else{
            x=1/x;
            n_2 = (n%2==0)?-(n/2):((-n-1)/2);
        }

        double at = myPow(x,n_2);
        return (n%2==0)?at*at:x*at*at;

    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-2147483648));
    }
}
