import java.util.*;

public class bai2 {
    public static String sq(String s){
        List<String> list = new ArrayList<>();

       for(int i = 0 ; i<s.length() ; i++){
           if(i==0){
               list.add(String.valueOf(s.charAt(i)));
               continue;
           }

           if(!list.isEmpty() && list.get(list.size()-1).equals(String.valueOf(s.charAt(i)))){
               list.remove(list.size()-1);
               if(!list.isEmpty()){
                   break;
               }
           }

           if(s.charAt(i-1)==s.charAt(i)){
               continue;
           }

           list.add(String.valueOf(s.charAt(i)));
       }

    StringBuilder result = new StringBuilder();
        for (String ch : list) {
        result.append(ch);
    }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aabcdddefghjjkklmn";
        System.out.println(sq(s));
    }
}

//"Cho 1 chuỗi ký tự S chỉ bao gồm [a-z], tìm chuỗi ký tự đầu tiên chỉ bao gồm các ký tự không bị lặp lại liên tiếp.
//
//VD:
//        - aaabbccdddefghjjkklmn -> efgh
// - aabccdef -> b
// - abbcc -> a
//
//Cần thực hiện với ít vòng for nhất có thể."

// Thêm thằng đầu tiên vào => continue
// Nếu list không rỗng và ci vị trí cuối cùng trong list = vị trí i => thì xóa vị trí cuối cùng trong list đi.
// Nếu list k rỗng => Chính là dãy đầu tiên k lặp
// Kiểm tra lại điều kiện xem s.chart(i-1) có = s.chart(i) => có thì bỏ qua
// Không rhif thêm vào list