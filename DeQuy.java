public class DeQuy {
    private static int curMax = -1;
    public static void findMax1(int[] arr,int n){
        if(n<arr.length){
            if(arr[n] > curMax){
                curMax = arr[n];
            }
            findMax1(arr,n+1);
        }
    }

    public static int findMax2(int[] arr,int i,int previousMax){
        if(i<arr.length){
            int curMax = Math.max(previousMax,arr[i]);
             return findMax2(arr,i+1,curMax);
        }
        return previousMax;
    }


    public static void main(String[] args) {
        int[] a = {2,1,23,1,24,4};
        curMax = -1;
        findMax1(a,0);
        System.out.println(curMax);

        System.out.println(findMax2(a,0,-1));
    }
}
