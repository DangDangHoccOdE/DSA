import java.lang.reflect.Array;
import java.util.Arrays;

public class _704_Binary_Search {
    // loop
    public static int search(int[] a, int target) {
        int L = 0;
        int R = a.length-1;
        int K=0;
        while (L<=R){
             K = (L+R)/2;

            if(a[K] >= target){
               R = K-1;
           }else{
               L=K+1;
           }
            if(a[K]==target){
                return K;
            }
        }
        return -1;
    }

    // recursion
    public static int search2(int[] a, int target) {
       int l = 0;
       int r = a.length-1;

        return recursion(a,target,l,r);
    }

    public static int recursion(int[] a,int target,int l,int r){
        int k=(l+r)/2;

        if(a[k]==target){
            return k;
        }
        if(l>r){
            return -1;
        }
        if(a[k]>=target){
           return recursion(a,target,l,k-1);
        }else{
           return recursion(a,target,k+1,r);
        }
    }

    public static void main(String[] args) {
        int[] a ={-1,0,3,5,9,12};
        System.out.println(search2(a,91));
    }
}
