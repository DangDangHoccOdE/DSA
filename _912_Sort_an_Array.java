import java.lang.reflect.Array;
import java.util.Arrays;

public class _912_Sort_an_Array {
    public static int[] mergeSort(int[] a,int l,int r){
        // THDB
        if(l>r){
            return new int[0];
        }

        if(l==r){
            return new int[]{a[l]};
        }

        // THTQ
        // Chia ra con 1 phan tu
        System.out.println("Tính: "+l+" - "+r);
        int k=(l+r)/2;
        int[] a1 = mergeSort(a,l,k);
        int[] a2 = mergeSort(a,k+1,r);

        // tron mang
        int[] s = merge(a1,a2);
        System.out.println("Ket qua merge: "+Arrays.toString(s));
        return s;
    }

    public static int[] merge(int[] a1,int[] a2){
        int n1 = a1.length;
        int n2 = a2.length;
        int n = n1+n2;
        int[] s = new int[n];

        int i1=0;int i2=0;int i3=0;
        while(i3 < n){
            if(i1>=n1){ // n1 rong
                s[i3] = a2[i2];
                i3++;i2++;
            }else if(i2>=n2){ // n2 rong
                s[i3] = a1[i1];
                i3++;
                i1++;
            }else if(a1[i1]<a2[i2]){
                s[i3] = a1[i1];
                i3++;i1++;
            }else{
                s[i3] = a2[i2];
                i3++;i2++;
            }
        }
        return s;
    }
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        // 5,1,1,2,0,0
        int[] a= {1,5,3,2,8,7,6,4};
        int[] b =sortArray(a);

        System.out.println(Arrays.toString(b));
    }
}
