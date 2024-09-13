import java.util.HashMap;

public class _290_Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] strings = s.split(" ");

        if(strings.length != pattern.length()){
            return false;
        }
        for(int i=0 ; i<pattern.length() ; i++){
            if( map.containsValue(strings[i])){
                // Neu chua dung key
                // check xem value co khop k
                String index = map.get(pattern.charAt(i));
                if(!strings[i].equals(index)){ // Kiem tra xem phan chuoi tring khop nhau k
                    return false;
                }

            }
            map.put(pattern.charAt(i),strings[i]);
        }

        return true;
    }

    public static void main(String[] args) {
       String pattern = "abba" ,s = "dog cat cat fish";
        System.out.println(wordPattern(pattern,s));
    }
}
