public class _1816_Truncate_Sentence {
    public static String truncateSentence(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int count =0;
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
            if(count==k){
                break;
            }
            stringBuilder.append(s.charAt(i));

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "Hello world nha e";
        System.out.println(truncateSentence(s,4));
    }
}
