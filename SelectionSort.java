public class SelectionSort {
    public static void printArray(int no,int[] a){
        System.out.printf("%d ",no);

        for(int i=0 ; i<a.length ; i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    public static void Selection_Sort(int[] a){

        for(int i=0 ; i<a.length-1 ; i++){
            int min = i;

            for(int j=i+1 ; j<a.length ; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }

            if(min!=i) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
            printArray(i,a);
        }
    }

    public static void main(String[] args) {
        int[] a= {2,3,4,5,1,23,1};
        Selection_Sort(a);
    }
}
