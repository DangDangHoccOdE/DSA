import java.util.*;
public class _386_exicographical_numbers {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> newList = new ArrayList<>();

        for(int i=1; i<=9;i++){
            if(i <= n){
                dfs(i,newList,n);
            }
        }
        return newList;
    }  // B1: Tìm max nó chạy . Min(n,9)

    public static void dfs(int i,List<Integer> list,int n){ // B2: add từng số vào
        list.add(i);                                        // B3: Sau khi add số đó, Kiểm tra xem x10 có nhỏ hơn n k, nhỏ hơn dfs tiếp

        for(int j=0 ; j<=9 ; j++){
            int next = i*10 + j;
            if(next< n){
                dfs(next,list,n);
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(lexicalOrder(192));

        System.out.println("DONE");
    }
}
