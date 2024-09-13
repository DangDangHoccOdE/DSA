public class BubbleSort {
    public static void printArray(int no, int[] a){
        System.out.printf("%d  ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d",a[i]);
        }
        System.out.println();
    }
    public static void Bubble_sort(int[] a){
        int n = a.length;
        for(int i=0 ; i<n ; i++){
            for(int j=n-1 ; j>i ; j--){
                if(a[j] < a[j-1]) {
                    int temp = a[j-1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
            printArray(i,a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5,9,8,4,2};
        Bubble_sort(a);
        for(int i :  a){
            System.out.println(i);
        }
    }
}
