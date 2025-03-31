package Leetcode75;

// Solution:
// 1: Check xem s1+s2 có bằng s2+s1 k => Nếu không thì k có ucnn
// 2: Tìm ucnn giữa 2 len để xđ length của ucnn
// 3: Substring từ chuỗi dài
public class _1071_Greatest_Common_Divisor_of_Strings {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        // Tim ucnn
        int length = ucnn(str1.length(), str2.length());
        return str1.length() > str2.length() ? str1.substring(0,length) : str2.substring(0,length);
    }

    public static int ucnn(int a, int b){
        if(a>b){
            return ucnn(a-b,b);
        }else if(a<b){
            return ucnn(a,b-a);
        }else{
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
