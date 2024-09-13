public class MyArrayStack implements IStackQueue{
    private int[] array;
    private int SIZE;
    private int topIndex;
    MyArrayStack(int size){
        SIZE = size;
        array = new int[size];
        topIndex = -1;
    }
    @Override
    public boolean push(int val) {
        if(!isFull()){
            topIndex++;
            array[topIndex] = val;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex==SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex<0;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i=0; i<=topIndex ; i++){
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }
    }
}
