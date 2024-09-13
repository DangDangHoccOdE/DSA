public class _1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int count =0;
        int countR =0;
        int countL =0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='R'){
                countR++;
            }if(s.charAt(i)=='L'){
                countL++;
            }
            if(countL==countR){
                count++;
                countL=0;
                countR=0;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
