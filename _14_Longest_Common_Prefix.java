import java.util.Arrays;

public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] s = {"aba","aa","aaa"};
        System.out.println(longestCommonPrefix(s));
    }
}
 // strs = ["flower","flow","flight"]