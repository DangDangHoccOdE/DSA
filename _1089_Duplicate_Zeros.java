public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] a) {
        int n = a.length;
        for(int i=0 ; i<n ; i++){
            if(a[i] ==0){
                for(int j=n-1 ; j>i ; j--){
                    a[j] = a[j-1];
                }
                i=i+1;
            }
        }
    }

    public static void main(String[] args) {
        int[] a ={1,0,2,3,0,4,5,0};
        duplicateZeros(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
