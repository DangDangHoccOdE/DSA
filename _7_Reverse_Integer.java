public class _7_Reverse_Integer {
//    public static int reverse(int x) {
//        if(x==0){
//            return 0;
//        }
//        boolean nhoHon0 = false;
//        if(x<0){
//            x=-x;
//            nhoHon0 = true;
//        }
//        StringBuilder ghepSo = new StringBuilder();
//        device(x,ghepSo);
//
//        String soCanTim  = ghepSo.toString();
//        int result = 0;
//        try{
//            result = Integer.parseInt(soCanTim);
//        }catch(NumberFormatException e) {
//            return 0;
//        }
//
//        return !nhoHon0 ? result : -result;
//    }
//
//    public static void device(int x,StringBuilder stringBuilder){
//        if(x/10==0 && x%10==0){
//            return ;
//        }
//
//        stringBuilder.append(x%10);
//        device(x/10,stringBuilder);
//    }

    public static int reverse(int x) {
        int newNum = 0;

        while(x!=0){
            if(x>Integer.MAX_VALUE/10 || x<Integer.MIN_VALUE/10){
                return 0;
            }
            newNum = newNum*10 + x%10;
            x=x/10;
    }
        return newNum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
