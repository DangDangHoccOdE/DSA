public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] a) {
        int m=a.length;
        int n=a[0].length;

        int rich = 0;
        for(int i=0 ; i<m ; i++){
            int temp =0;
            for(int j=0 ; j<n ; j++){
                temp+=a[i][j];
            }
            if(temp>rich){
                rich= temp;
            }
        }

        return rich;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,4,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
