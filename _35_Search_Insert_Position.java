public class _35_Search_Insert_Position {
    public static int searchInsert(int[] a, int target) {
        int l = 0;
        int r = a.length-1;
        int k=0;
        while (l<=r){
            k = (l+r)/2;
            if(a[k]==target){
                return k;
            }

            if(a[k]>=target){
                r=k-1;
            }else{
                l = k+1;
            }
        }

        return target>a[k]?k+1:k;
    }

    public static void main(String[] args) {
        int[] a = {1,3};
        System.out.println(searchInsert(a,2));
    }
}
