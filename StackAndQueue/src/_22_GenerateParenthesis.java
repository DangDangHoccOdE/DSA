import java.util.*;
public class _22_GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        deQuy(list,"",n, n);
        return list;
    }

    public static void deQuy(List<String> list,String current,int n,int k){
        if(n<=0 && k<=0){
            list.add(current);
            return;
        }

        if(n>0){
            deQuy(list,current+"(",n-1,k);
        }

        if(k>n){
            deQuy(list,current+")",n,k-1);
        }

    }

    public static void main(String[] args) {
        List<String> s = generateParenthesis(2);

        System.out.println("DONE");
    }
}
