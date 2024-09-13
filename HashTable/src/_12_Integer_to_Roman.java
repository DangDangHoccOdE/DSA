import java.util.HashMap;

public class _12_Integer_to_Roman {
    public static String intToRoman(int num) {
        HashMap<Integer,String> maps = new HashMap<>();
        maps.put(1,"I");
        maps.put(4,"IV");
        maps.put(5,"V");
        maps.put(9,"IX");
        maps.put(10,"X");   // Solution Khỏi tạo các giá tri, Lấy num - đi giá trị đố nếu lớn hơn append vào builder
        maps.put(40,"XL");
        maps.put(50,"L");
        maps.put(90,"XC");
        maps.put(100,"C");
        maps.put(400,"CD");
        maps.put(500,"D");
        maps.put(900,"CM");
        maps.put(1000,"M");

        int[] integers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder builder = new StringBuilder();

       for(Integer i : integers){
           while(num >= i) {
               num -= i;
               builder.append(maps.get(i));
           }
       }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(intToRoman(400));
    }
}
