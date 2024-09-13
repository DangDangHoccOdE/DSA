import java.util.LinkedList;
import java.util.Queue;

public class _649_Dota2_Senate {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> queueR = new LinkedList<>();
        Queue<Integer> queueD = new LinkedList<>();
        int n = senate.length();

        for(int i=0; i< senate.length() ; i++){
            char c = senate.charAt(i);
            if(c=='R'){
                queueR.add(i);
            }else{
                queueD.add(i);
            }
        }

        while (!queueR.isEmpty() && !queueD.isEmpty()){
            int r = queueR.peek();
            int d = queueD.peek();
            if(r<d){
                queueD.remove();
                queueR.add(r+n-1);
                queueR.remove();
            }else{
                queueR.remove();
                queueD.add(d+n-1);
                queueD.remove();
            }
        }

        return queueR.isEmpty() ? "Dire":"Radiant";
    }

    public static void main(String[] args) {
        String s = "RDD";
        System.out.println(predictPartyVictory(s));
    }
}
