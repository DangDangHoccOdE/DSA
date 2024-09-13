import java.util.ArrayList;

public class MyHashMap {
    private final int SIZE=1000;

    public class Data{
        int key;
        int value;
        Data(int key,int value){
                this.key = key;
                this.value =value;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Data){
                return this.key == ((Data) obj).key ;
            }
            return false;
        }
    }
    private ArrayList<Data> myBuckets[] ;
    MyHashMap(){
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key){
        return key%SIZE;
    }

    public void put(int key, int value){
        int keyValueIndex = hashFunction(key);
        var bucket = myBuckets[keyValueIndex];
        int keyIndex = bucket.indexOf(new Data(key,value));
        if(keyIndex>=0){
            bucket.get(keyIndex).value = value;
        }else{
            bucket.add(new Data(key,value));
        }
        int xx =0;
    }

    public void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data data = new Data(key,0);
        bucket.remove(data);
        int x =0;
    }

    public int get(int key){
        int hashValueIndex =  hashFunction((key));
        var bucket = myBuckets[hashValueIndex];
        Data data = new Data(key,0);
        int keyIndex = bucket.indexOf(data);
        if(keyIndex>=0){
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,1);
        myHashMap.put(1,2);
        myHashMap.put(10,1);
        System.out.println("" + myHashMap.get(1));
        System.out.println("" + myHashMap.get(2));
        myHashMap.remove(1);
        System.out.println("" + myHashMap.get(1));
        System.out.println("" + myHashMap.get(10));

    }

}
