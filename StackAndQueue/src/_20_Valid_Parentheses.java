import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char prev = stack.peek();
                if((prev=='(' && c==')') || (prev=='{' && c=='}') || (prev=='[' && c==']') ){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[]}}";
        System.out.println(isValid(s));
    }
}
