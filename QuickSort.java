import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] a,int l,int r){
        if(l>=r){
            return;
        }
        // B1) Chọn khóa
        int key = a[(l+r)/2];

        // B2) Phân Bố mảng theo khóa
        int k = phanBoLai(a,l,r,key);
        System.out.println("Tinh k: "+k);
        System.out.println("Tinh r: "+r);
        System.out.println("Tinh l: "+l);
        System.out.println("--------------------------------------------------\n\n");

        // B3) Chia ra => Làm lại
        quickSort(a,l,k-1);
        quickSort(a,k,r);


    }

    static int phanBoLai(int[] a,int l, int r,int key){
        while(l<=r) {
            while(a[l] < key){
                l++;
            }
            while(a[r] > key){
                r--;
            }
            if (l<=r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;

                l++;
                r--;
            }
        }

        return l;
    }
    public static void main(String[] args) {
        int[] a = {6,7,8,5,4,1,2,3};

        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
