public class _1863_Sum_Of_All_Subset_XOR_Totals {
    private int[] selection; // Giữ những giá trị được bằng 1;
    private int[] validValue={0,1}; // Những giá trị được chọn
    private int resultSum = 0;
    private int n; // size
    private int[] nums;
//    private int tinhXORTotal(){
//        int total = 0;
//        for (int i = 0; i < selection.length; i++) {
//            if(selection[i] == 1){
//                total = total ^ nums[i];
//            }
//        }
//        return total;
//    }
    private void backtrack(int index,int currXOR){
        for (int i = 0; i < validValue.length; i++) {
            selection[index] = validValue[i];
            if(selection[index]==1){
                currXOR = currXOR ^ nums[index];
            }

            if(index == n-1){
                int sum = currXOR;
                resultSum+=sum;
            }else{
                backtrack(index+1,currXOR);
            }

//            if(index == n-1){
//                 process
//                int sum = tinhXORTotal();
//                resultSum += sum;
//            }else{
//                backtrack(index+1);
//            }
        }
    }

    public int subsetXORSum(int[] nums) {
        this.selection = new int[nums.length];
        this.n = nums.length;
        this.nums = nums;
        backtrack(0,0);
        return resultSum;
    }
}
