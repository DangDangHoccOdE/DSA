import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueJava {
    public static void main(String[] args){
//        Stack<Integer> myStack = new Stack<>();
//
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//
//        for(Integer i : myStack){
//            System.out.println(i);
//        }
//
//        System.out.println("POP"+myStack.peek());
//        System.out.println("POP"+myStack.pop());
//        System.out.println("POP"+myStack.pop());
//        System.out.println("isEmpty"+myStack.isEmpty());


        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        for(Integer i : myQueue){
            System.out.print(i+" ");
        }
        myQueue.remove();

        for(Integer i : myQueue){
            System.out.print(i+" ");
        }
    }
}
