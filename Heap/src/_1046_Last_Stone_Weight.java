import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class _1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i:stones){
            heap.add(i);
        }

        while(heap.size()>1){
            int max1 = heap.poll();
            int max2 = heap.poll();

            if(max2 == max1){

            }else if(max2<max1){
                heap.add(max1-max2);
            }else{
                heap.add(max2-max1);
            }
        }

        return heap.isEmpty()?0:heap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }
}
