public class MyHeap {
    private static int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE+1];
    private int size;

    public MyHeap(){
        size = 0;
    }

    public boolean isEmpty(){
        return size<=0;
    }

    public int peek(){
        if(isEmpty()){
            // throw exception
            System.out.println("Error List empty");
        }
        return arr[1];
    }

    public void swap(int i,int j){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    public void add(int v){
        size++;
        arr[size]  = v;

        // heapify up
        int curNode = size;
        int parentIndex = curNode/2;

        while(parentIndex != 0 && arr[parentIndex] > arr[curNode]){
            swap(parentIndex,curNode);
            curNode = parentIndex;
            parentIndex = curNode/2;
        }
    }

    public int poll(){
        if(isEmpty()){
            System.out.println("Heap is Empty");
            return -1;
        }

        int min = arr[1];
        // Heapify down
        arr[1] = arr[size];
        size--;

        heapifyDown(1);

        return min;
    }

    public void remove(int v){
        int curIndex = -1;
        for (int i = 0; i < size; i++) {
            if(arr[i] == v){
                curIndex = i;
                break;
            }
        }
        if(curIndex == -1){
            System.out.println("Error: Element is not exists!");
        }

        arr[curIndex] = arr[size];
        size--;

        // heapify down
        heapifyDown(curIndex);
    }

    public void heapifyDown(int x){
        int curIndex =x;

        while((2*curIndex)<=size){
            int leftChildIndex = 2*curIndex;
            int rightChildIndex = leftChildIndex+1;
            int smallerChildIndex = leftChildIndex;

            if(rightChildIndex <= size && arr[rightChildIndex] < arr[leftChildIndex]){
                smallerChildIndex = rightChildIndex;
            }

            if(arr[curIndex] > arr[smallerChildIndex]){
                swap(curIndex,smallerChildIndex);
                curIndex = smallerChildIndex;
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();
        myHeap.add(10);
        myHeap.add(4);
        myHeap.add(2);

//        while(!myHeap.isEmpty()){
//            System.out.println(myHeap.poll());
//        }

        System.out.println("Peek:"+myHeap.peek());
        myHeap.remove(2);
        System.out.println("Peek:"+myHeap.peek());
    }
}
