import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_Recent_Calls {
        public _933_Number_of_Recent_Calls() {

        }

        public Queue<Integer> queue = new LinkedList<>();
        public int ping(int t) {
            queue.add(t);

            while(queue.peek() < (t-3000)){
                queue.remove();
            }
            return queue.size();
        }

}
