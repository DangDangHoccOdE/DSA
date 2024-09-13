public class MyLinkedListQueue implements IStackQueue{
    public class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
        }
    }

    Node headNode,tailNode;
    MyLinkedListQueue(){
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int val) {
        if(!isFull()){
            Node newNode = new Node(val);
            if(isEmpty()){
                headNode = tailNode = newNode;
            }else {
                tailNode.next = newNode;
                tailNode = newNode;
            }
        }
        return false;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int value = -1;

        if(headNode == tailNode){
            headNode = tailNode = null;
        }else{
            value = headNode.value;
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null && tailNode == null;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node currNode = headNode;
        while(currNode!=null){
            System.out.print(currNode.value+"");
            currNode= currNode.next;
        }
    }
}
