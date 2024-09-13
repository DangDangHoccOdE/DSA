import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue{
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    Node topNode;
    MyLinkedListStack(){
        topNode = null;
    }
    @Override
    public boolean push(int val) {
        // Thêm vào đầu của linkedList
        if(!isFull()){
            Node newNode = new Node(val);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int val = topNode.val;
        topNode=topNode.next;
        return val;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode==null;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        Node temp = topNode;
        ArrayList<Integer> tempList = new ArrayList<>();
        while(temp!=null){
            tempList.add(temp.val);
            temp = temp.next;
        }

        for(int i=tempList.size()-1;i>=0 ; i--){
            System.out.print(tempList.get(i) + " ");
        }
        System.out.println();
    }
}
