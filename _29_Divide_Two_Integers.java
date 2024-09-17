public class _29_Divide_Two_Integers {
    public static int divide(int dividend, int divisor) {
        // B1: Kiem tra dau tra ve:
        if(dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean dauAm = (dividend < 0) ^ (divisor < 0);

        // B2: lay tri tuyet doi
        long a1 = Math.abs((long)dividend);
        long a2 = Math.abs((long)divisor);

        // B3: Dich bit diviosr sang trai << . Lay dividend - max khi dịch bit + 1; 10 - 9 + 2 = 2 ( 10 /3) 3>>2 = 9;
        int result  = 0;
        while(a1 >= a2){
            long a = a2; // Luôn giữ a = a2 ;
            int count = 1; // Ch tăng đến count = 2 là sẽ tạo vòng mới

            while(a1 >= a<<1){
                count<<=1;
                a<<=1;
            }

            a1 -= a;  // Giảm a1 xuống
            result+=count;
        }

        return dauAm ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(divide(13,3));
    }
}
