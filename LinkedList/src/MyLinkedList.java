public class MyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static void printLinkedList(Node head){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val);
                temp=temp.next;
                if(temp!=null){
                    System.out.print("->");
                }
            }
        }
    }

    public static Node addTpHead(Node headNode,int val){
        Node node = new Node(val);
        if (headNode!=null){
            node.next = headNode;
        }
        return node;

    }
    public static Node addToTail(Node headNode,int val){
        Node newNode = new Node(val);
        if(headNode==null){
            return newNode;
        }else{
            Node node = headNode;
            while (node.next!=null){
                node = node.next;
            }
            node.next = newNode;
            newNode.next=null;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode,int index,int value){
        Node newNode = new Node(value);
        if(index==0){
            return addTpHead(headNode,value);
        }else{
            Node prevNode = headNode;
            int count = 0;
            while(prevNode!=null){
                count++;
                if(count == index){
                    newNode.next = prevNode.next;
                    prevNode.next = newNode;
                    break;
                }
                prevNode = prevNode.next;
            }

            return headNode;
        }

    }

    public static Node deleteToHead(Node headNode){
        if(headNode!=null){
            headNode = headNode.next;
        }
        return headNode;
    }
    public static Node deleteToTail(Node headNode){
        if(headNode==null){
            return null;
        }
        Node lastNode = headNode;
        Node prevNode = null;
        while(lastNode.next!=null){
            prevNode=lastNode;
            lastNode=lastNode.next;
        }
        if(prevNode==null){
            return null;
        }else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node deleteToIndex(Node headNode,int index){
        if(headNode==null){
            return null;
        }
        if(index == 0){
            return deleteToHead(headNode);
        }
        Node curNode = headNode;
        Node prevNode = null;

        int count = 0;
        while(curNode!=null && count!=index){
            count++;
            prevNode = curNode;
            curNode = curNode.next;
        }
        if(curNode==null || index<0){
            return headNode;
        }

        prevNode.next = curNode.next;
        curNode.next = null;


        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

//        printLinkedList(n1);
        n1 = addTpHead(n1,4);
//        printLinkedList(n1);
        n1 = addToTail(n1,5);
//        printLinkedList(n1);
        n1 = addToIndex(n1,0,7);
        printLinkedList(n1);
//        System.out.println();
//        n1 = deleteToHead(n1);
//        printLinkedList(n1);
//        System.out.println();
//        n1 = deleteToHead(n1);
//        printLinkedList(n1);
//        n1=deleteToTail(n1);
//        System.out.println();
//        printLinkedList(n1);
//        n1=deleteToTail(n1);
//        System.out.println();
//        printLinkedList(n1);
        System.out.println();
        n1 = deleteToIndex(n1,0);
        printLinkedList(n1);
        System.out.println();
        n1 = deleteToIndex(n1,8);
        printLinkedList(n1);
        System.out.println();
    }
}
