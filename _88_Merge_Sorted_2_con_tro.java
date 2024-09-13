public class _88_Merge_Sorted_2_con_tro {
    public static void merge(int[] a, int m, int[] b, int n) {
        int i = m-1;
        int j=n-1;
        for(int o = a.length-1;o>=0 ; o--){
            if(i<0) {
                a[o] = b[j];
                j--;
            }else if(j<0){
                a[o] = a[i];
                i--;
            }else if(a[i]<b[j]){
                a[o] = b[j];
                j--;
            }else if(a[i]>=b[j]){
                a[o] = a[i];
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,0,0,0};
        int[] b ={2,5,6};

        merge(a,3,b,3);
        for(int i:a){
            System.out.println(i);
        }
    }
}
