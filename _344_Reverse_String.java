public class _344_Reverse_String {
//    public static void reverseString(char[] s) {
//        int index = 0;
//        StringBuilder stringBuilder = new StringBuilder();
//        reverse(index,s,stringBuilder);
//
//        for(int i=0 ; i<stringBuilder.length() ; i++){
//            s[i] = stringBuilder.toString().charAt(i);
//        }
//    }
//
//    public static void reverse(int start, char[] c,StringBuilder s){
//        if(start==c.length){
//            return ;
//        }
//        reverse(start+1,c,s);
//        s.append(c[start]);
//    }

    // 2 con trỏ
    public static void reverseString(char[] s) {
       int left = 0;
       int right = s.length-1;

   while(left<right){
       var temp = s[left];
       s[left] = s[right];
       s[right] =temp;
       left++;
       right--;
   }
    }


    public static void main(String[] args) {
        char[] s= {'a','b','c'};
        reverseString(s);
        for(Character c : s){
            System.out.println("C"+c);
        }
    }
}
