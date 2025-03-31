import java.util.*;

public class _17_Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) return res;

        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        backtrack(res,phoneMap,digits,0,new StringBuilder());
        return res;
    }

    private static void backtrack(List<String> res,Map<Character, String> phoneMap,String digits,int index,StringBuilder sb){
        if(index == digits.length()){
            res.add(sb.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);

        for(char letter : letters.toCharArray()){
            sb.append(letter);
            backtrack(res,phoneMap,digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
