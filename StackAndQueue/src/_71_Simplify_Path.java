import java.util.Stack;
import java.util.stream.Collectors;

public class _71_Simplify_Path {
    public static String simplifyPath(String path) {
       Stack<String> stacks = new Stack<>();
       String[] component = path.split("/");

        for(String s : component){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            if(s.equals("..")){
                if(!stacks.isEmpty()){
                    stacks.pop();
                }
            }else{
                stacks.push(s);
            }
        }

        if(stacks.isEmpty()){
            return "/";
        }

        StringBuilder builder = new StringBuilder();
        for(String s : stacks){
            builder.append("/").append(s);
        }
        return builder.toString();
    }

    // Solution : Tách chuỗi thành các chuỗi bằng cách tách dấu /
    // Nếu gặp "" (Thay thế cho dấu / ) hoặc dấu . thì bỏ qua
    // Nếu gặp dấu .. thì peek thằng ầu ra
    // Còn không thì cứ push vô
    // Nếu stack rỗng trả về đường dẫn mặc định /
    // Neu không thì append / + chuỗi

    public static void main(String[] args) {
        String path ="/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(path));
    }
}
