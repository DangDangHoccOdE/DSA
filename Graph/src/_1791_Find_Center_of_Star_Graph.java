package Graph.src;

public class _1791_Find_Center_of_Star_Graph {
    public static int findCenter(int[][] edges) {
        int[] count = new int[edges.length+2];

        for (int[] i: edges) {
            count[i[0]]++;
            count[i[1]]++;
        }

        for (int i = 0; i < edges.length+2; i++) {
            if(count[i] == edges.length){
                return i;
            }
            System.out.println("Count"+i+" :"+count[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] s = {{1,18},{18,2},{3,18},{18,4},{18,5},{6,18},{18,7},{18,8},{18,9},{18,10},{18,11},{12,18},{18,13},{18,14},{15,18},{16,18},{17,18}};
        System.out.println(findCenter(s));
    }
}
