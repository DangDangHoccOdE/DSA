import java.util.*;
public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        int[] count = new int[125];
        char[] arr =s.toCharArray();

        for(int i=0 ; i<arr.length ; i++){
            char c = arr[i];
            int index = c;
            count[index]++;
        }

        for(int i=0 ;i<arr.length;i++){
            char c = arr[i];
            int index = c;
            if(count[index]==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(firstUniqChar(s));
        System.out.println("DONE!");
    }

    // [97-122]
}
