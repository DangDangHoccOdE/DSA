import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _1700_Number_of_Students_Unable_to_Eat_Lunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(Integer i:students){
            queue.add(i);
        }

        for(int i=sandwiches.length-1 ; i>=0 ; i--){
            stack.push(sandwiches[i]);
        }

        int count = 0;
        while(count!=queue.size()){
            if(!queue.isEmpty() && !stack.isEmpty()) {
                if (!queue.peek().equals(stack.peek())) {
                    queue.add(queue.peek());
                    queue.remove();
                    count++;
                } else if (queue.peek().equals(stack.peek())) {
                    queue.remove();
                    stack.pop();
                    count=0;
                }
            }else{
                break;
            }
        }

        return queue.size();

    }

    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};

        System.out.println(countStudents(students,sandwiches));
        // 0 tròn 1 vuông
        /*
        [1,1,1,0,0,1], bánh sandwich = [1,0,0,0,1,1]
        1 1 0 0 1  => 1 0 0 1 1 => 0 0 1 1 1 => 0 1 1 1 => 1 1 1 => 1 1 1
        0 0 0 1 1     0 0 0 1 1    0 0 0 1 1    0 0 1 1    0 1 1
         */
    }
}
