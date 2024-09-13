public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
//        int count = 0;
//        int k = nums.length-1;
//        for(int i=0 ; i<nums.length ;){
//            if(nums[i] == val){
//                for(int j=i ; j<nums.length-1 ; j++){
//                    nums[j] = nums[j+1];
//                }
//                k--;
//            }
//
//            if(nums[i]!=val) {
//                i++;
//                count++;
//            }
//
//            if(count>k){
//                break;
//            }
//        }
//        return count;

        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){  // Đếm xem có bao nhiêu giá trị khác val
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,3};

        System.out.println(removeElement(a,2));
    }
}
