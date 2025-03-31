package Leetcode75;

public class _1768_Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int size1 = word1.length();
        int size2 = word2.length();
        int i=0,j =0;
        while(i <= size1 && j <= size2){
            if(i < size1){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j < size2){
                sb.append(word2.charAt(j));
                j++;
            }

            if(i == size1 && j == size2){
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "cde"));
    }
}
