import java.util.*;
public class _386_exicographical_numbers {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            newList.add(i);
            dfs(i*10,newList,n,i*10+10);
        }

        return newList;
    }

    public static void dfs(int i,List<Integer> list,int n,int max){
        if(i > n || i > max){
            return;
        }

        list.add(i);
        dfs(i+1,list,n,max);
    }

    public static void main(String[] args) {
        System.out.println(lexicalOrder(20));

        System.out.println("DONE");
    }
}
