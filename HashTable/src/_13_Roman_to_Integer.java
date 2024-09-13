import java.util.HashMap;

public class _13_Roman_to_Integer {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> maps = new HashMap<>();
        maps.put('I',1);
        maps.put('V',5);
        maps.put('X',10);
        maps.put('L',50);
        maps.put('C',100);  
        maps.put('D',500);
        maps.put('M',1000);
        
        int x = 0;
        int k= 0;
        for(int i=1 ; i<s.length()  ; i++){
            if(k<s.length()){
                Character before = s.charAt(k);
                Character after = s.charAt(i);
                if(maps.get(before) < maps.get(after)){  // So dang trc nho hon so dang sau
                    x+= maps.get(after) - maps.get(before);
                    i++;
                    k++;
                }else{
                    for (Character character : maps.keySet()){
                        if(character.equals(before)){
                            x+=maps.get(before);
                        }
                    }
                }
                k++;

            }

        }
        if(k==s.length()-1){
            x+=maps.get(s.charAt(k));
        }
        return x ;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
