public class _1694_Reformat_Phone_Number {
    public static String reformatNumber(String number) {
        String noSignal = number.replace("-","").replace(" ","");
        StringBuilder result = new StringBuilder();
        result.append(reformat(noSignal));
        return result.toString();
    }

    public static String reformat(String number){
        if(number.length() == 2 || number.isEmpty() || number.length() ==3){
            return number;
        }

        if(number.length()==4){
            return reformatNumber(number.substring(0,2))+"-"+reformatNumber(number.substring(2,4));
        }

        return number.substring(0,3)+"-"+ reformatNumber(number.substring(3));
    }

    public static void main(String[] args) {
        String string = "1-23-45 6789";
        System.out.println(reformatNumber(string));
    }
}
// 12345678 => 123-456-78