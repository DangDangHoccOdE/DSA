public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int x:nums){
            int a = countNumber(x);

            if(a%2 ==0){
                count++;
            }
        }

        return count;
    }

    public static int countNumber(int x){
        int count = 1;
        while(true){
            x=x/10;
            if(x!=0){
                count++;
            }else{
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,10,20,3,6904};

        System.out.println(findNumbers(a));
    }
}
