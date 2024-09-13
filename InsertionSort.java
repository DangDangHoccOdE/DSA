public class InsertionSort {
    public static void printArray(int no,int[] a){
        System.out.printf("%d ",no);

        for(int i=0 ; i<a.length ; i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    public static void insertion_sort(int[] a){
        for(int i=1 ; i< a.length ; i++){
            int j = i-1;
            int k=j+1;

            while( j>=0 && k>=0&&a[k] < a[j] ){
                int temp = a[k];
                a[k] = a[j];
                a[j] = temp;
                j--;
                k--;
            }

            printArray(i,a);
        }
    }

    public static void main(String[] args) {
        int[] a= {5,1,6,3,4,4,2};
        insertion_sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
