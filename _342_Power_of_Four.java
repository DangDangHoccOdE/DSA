public class _342_Power_of_Four {
    public static boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }

        if(n<1 || n%4!=0){
            return false;
        }

        return isPowerOfFour(n/4);
    }

    public static void main(String[] args) {

    }
}
