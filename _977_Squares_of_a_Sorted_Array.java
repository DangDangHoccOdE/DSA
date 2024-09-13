public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] a) {
//        for(int i=0 ; i<a.length ; i++){
//            a[i] = (int) Math.pow(a[i],2) ;
//        }
//        for(int i=0 ; i<a.length - 1 ;i++){
//            for(int j=i+1;j<a.length ; j++){
//                if(a[i] > a[j]){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }

        int n = a.length;
        int[] result = new int[n];
        int i = 0; int j = n-1;
        while(j>=i){
            if(Math.abs(a[i])>Math.abs(a[j])){
                i++;
            }else{
                j--;
            }
        }

        int k=0;
        while(j>=0 || i<=a.length-1){
            if(j>=0 && i<=a.length-1){
                if(Math.abs(a[i]) > Math.abs(a[j])){
                    result[k] = a[j] * a[j];
                    j--;
                }else{
                    result[k] = a[i] * a[i];
                    i++;
                }
            }else if(j>=0){
                result[k] =  a[j] * a[j];
                j--;
            }else{
                result[k] = a[i] * a[i];
                i++;
            }
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};
        int[] b = sortedSquares(a);
        for(int i:b){
            System.out.println(i);
        }
    }
}
