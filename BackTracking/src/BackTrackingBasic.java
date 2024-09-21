public class BackTrackingBasic {
    private static String[] colors = {"red","green","blue","yellow","purpose"};
    private static int[] selections = new int[colors.length];
    private static int[] validValues = {0,1};
    private static void backTrack(int currentIndex){
        for (int i = 0; i < validValues.length; i++) {
            selections[currentIndex] = validValues[i];
            if(currentIndex == colors.length-1){
                process(selections);
            }else{
                backTrack(currentIndex+1);
            }
        }
    }
    private static int count = 0;
    public static void process(int[] selection){
        String newMixColor = "";
        for (int i = 0; i < selection.length; i++) {
            if(selection[i]== 1){
                newMixColor += colors[i];
            }
        }
        count++;
        System.out.println("newColor: "+newMixColor + " newCount: "+count);
    }
    public static void main(String[] args) {
        backTrack(0);
    }
}
