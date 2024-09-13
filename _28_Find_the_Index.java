public class _28_Find_the_Index {
    public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i=0 ; i<=haystack.length()-needle.length() ; i++){
            int j=0;
            while(haystack.charAt(i+j) == needle.charAt(j)){
                j++;
                if(j==needle.length()){
                    return i;
                }
            }
        }

        return -1;
    }
 // solution :
    // Kiểm tra nếu mảng hays nhỏ hơn needle trả về -1
    // Cách giữ vị trí i : s1-s2 để tối ưu lần duyệt và i+j <= s1
    // Đi từng haystack nếu nó trùng thì duyệt theo j. i+j sẽ giúp duyệt vòng for i.
    public static void main(String[] args) {
        String  haystack = "a", needle = "a";
        System.out.println(strStr(haystack,needle));
    }
}
