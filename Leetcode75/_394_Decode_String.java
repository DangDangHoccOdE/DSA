package Leetcode75;

import java.util.Stack;

public class _394_Decode_String {
    public static String decodeString(String s) {
        /*
            54[ab6[cd]]
            stack=5,4,[a,b,6,[c,d
            stack=5,4,[a,b,6*cd

            Solution:
            duyệt từ đầu đến cuối
            tạo 2 stack lưu số và chuỗi và StringBuilder res
            nếu là số => tìm số đó bằng cách num * 10 + (c - '0')
            nếu là [
                 num = 0;
                 stack character pushs chuỗi res
                 res làm mới
                 stack number push num
             nếu là ]
                int repeat = stack number . pop
                StringBuilder temple = stack character . pop
                res = temple.append(res.toString().repeat(repeat)
              else
                curent.append (c)
         */
        Stack<String> stackString = new Stack<>();
        Stack<Integer> stackCount = new Stack<>();
        StringBuilder res = new StringBuilder();
        int num = 0;

        for(Character c: s.toCharArray()){
            if(Character.isDigit(c)){
                num = num* 10 + (c - '0');
            }else if(c == '['){
                stackCount.push(num);
                System.out.println("push: "+res.toString());
                stackString.push(res.toString());
                res = new StringBuilder();
                num = 0;
            }else if(c == ']'){
                int repeat = stackCount.pop();
                System.out.println("Count: " + repeat);
                StringBuilder temp = new StringBuilder(stackString.pop());
                System.out.println("Temp: "+temp);
                res = temp.append(res.toString().repeat(repeat));
                System.out.println("Res:"+res);
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }

    // 54[a[4[b[3c]]]
    // 54
    // 2[bc] => bcbc
    // Gia su so 21 ,so 0 la 48 ,so 1 la 49
    // Lan 1: 0*10 + (2) = 0*10 + 50-48 =  2
    // Lan 2: 2 * 10 + 49-48 = 21

    public static void main(String[] args) {
        System.out.println(decodeString("5[a[2[bc]]]"));
    }
}
