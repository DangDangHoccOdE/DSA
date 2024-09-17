package Graph.src;

import java.util.HashSet;
import java.util.Set;

public class MyDijkstra {
    public static void main(String[] args) {
        int n = 5; // 0-4
        int[][] a = {
                {0,6,0,1,0},
                {6,0,5,2,2},
                {0,5,0,0,5},
                {1,2,0,0,1},
                {0,2,5,1,0}
        };

        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n]; // distance[i] la khoang cach tu dinh dau den i
        int[] previous = new int[n]; // la dinh ngay phia truoc i

        int start = 0;
        int finish = 2;
        int oo = Integer.MAX_VALUE;

        // Buoc 1: Khoi tao khoang cach
        for (int i = 0; i < n; i++) {
            distance[i] = oo;
        }

        distance[start] = 0;

        while(visited.size()<n){
            // Buoc 2: Chon dinh chua duyet va co khoang cach nho nhat lam dinh dang sey
            int dangXet = 0;
            int minDistance = oo;
            for (int i = 0; i < n; i++) {
                if(visited.contains(i)==false && distance[i]<minDistance){
                    minDistance = distance[i];
                    dangXet = i;
                }
            }

            // Buoc 3: Từ đỉnh đang xét, duyệt tất cả đỉnh đề chưa duyệt
            // Update khoảng cách và đỉnh trước của đỉnh đó
            for (int i = 0; i < n; i++) {
                if(visited.contains(i)==false && a[dangXet][i] != 0){
                    int newDistance = distance[dangXet] + a[dangXet][i];
                    if(newDistance < distance[i]){
                        distance[i] = newDistance;
                        previous[i] = dangXet;
                    }
                }
            }

            // Buoc 4: Danh dau dinh dang xet
            visited.add(dangXet);
        }

        System.out.println("Khoang cach nho nhat tu "+start+ " den " + finish +": "+distance[finish]);

        System.out.println("Duong di la: ");

        int chay = finish;
        while(chay!= start){
            System.out.print(chay+"<-");
            chay = previous[chay];
        }
        System.out.print(chay);
    }
}
