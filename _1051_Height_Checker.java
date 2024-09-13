public class _1051_Height_Checker {
    public static int heightChecker(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        int count = 0;

        for(int i=0 ; i<n ; i++){
            b[i] = a[i];
        }
        for(int i=0 ; i<n-1 ; i++){
            int min = i;
            for(int j=i+1;j<n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }

        for(int i=0 ; i<b.length ; i++){
            if(a[i]!=b[i]){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,1,4,2,1,3};
        System.out.println(heightChecker(a));
    }

}
