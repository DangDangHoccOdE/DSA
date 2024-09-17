package Graph.src;
public class _200_Number_of_Islands{
    public static boolean[][] daDuyet = new boolean[300][300];
    static int soHang;
    static int soCot;
    public static boolean valid(int i,int j){
        return i>=0 && j>=0 && i<soHang&&j<soCot;
    }

    public static void DFS(int i,int j,char[][] a){
        if(!valid(i, j)){
            return;
        }

        if(a[i][j] == '0' || daDuyet[i][j]){
            return;
        }

        daDuyet[i][j] = true;

        DFS(i,j+1,a);
        DFS(i,j-1,a);
        DFS(i+1,j,a);
        DFS(i-1,j,a);
    }
    public static int numIslands(char[][] a) {
        int count = 0;
        soHang = a.length;
        soCot = a[0].length;
        for (int i = 0; i <soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if(a[i][j] == '1' && !daDuyet[i][j]){
                    count++;
                    DFS(i,j,a);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] a = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
        };

        System.out.println(numIslands(a));
    }
}