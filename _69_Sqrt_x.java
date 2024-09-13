public class _69_Sqrt_x {
    public static int mySqrt(int x) {

        int l=1;
        int r =x;
        int k = 0;

        while(l<=r){
            k=(r+l)/2;
            if(x/k==k){
                return k;
            }else if(x/k>k){
                l=k+1;
            }else{
                r=k-1;
            }
        }
        return (x>0 && x/k<k)? k-1 : k;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }
}
