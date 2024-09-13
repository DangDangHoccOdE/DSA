public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] a) {
        int max =0;
        int count =0;
        for(Integer i : a){
            if(i==1){
                count++;
            }
            else{
                if(max<=count){
                    max = count;
                }
                count = 0;
            }
        }
        if(max<=count){
            max = count;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(a));
    }
}
