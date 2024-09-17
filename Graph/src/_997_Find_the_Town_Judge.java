package Graph.src;

public class _997_Find_the_Town_Judge {
    public static int findJudge(int n, int[][] trust) {

        int[] count = new int[n+1]; // Mảng này sẽ giữ số lượng người bầu cử
        for (int[] i : trust){  // di tung mang trong trus
            count[i[0]]--;
            count[i[1]]++;
        }

        for (int i = 1; i < n+1; i++) {
            if(count[i] == n-1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n=2;
        int[][] trust = {{1,2}};

        System.out.println(findJudge(n,trust));
    }
}
