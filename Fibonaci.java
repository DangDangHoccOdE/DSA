public class Fibonaci {
    public static int Fibo(int n){
            if(n<=2){
                return 1;
            }
        int Fn = Fibo(n-1) + Fibo((n-2));
       return Fn;
    }

    public static void printElement(int[] a,int index){
        if(index<0 || index>=a.length){
            return;
        }
        System.out.println(a[index]);
        printElement(a,index+1);
    }

    public static void printElement2(int[] a,int index){
        if(index<0 || index>=a.length){
            return;
        }
        printElement2(a,index+1);
        System.out.println(a[index]);
    }

    // de quy co nho
    public static int[] F =new int[1000];
    public static int Fibo2(int n){
        if(F[n]!=0){
            return F[n];
        }
        if(n<=2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibo2(n-1)+Fibo2(n-2);
        return F[n];
    }

    // khong su dung de quy
    public static int Fibo3(){
        int[] Fibo = new int[11];
        Fibo[1]=1;
        Fibo[2]=1;
        for(int i=3;i<Fibo.length;i++){
            Fibo[i] = Fibo[i-1]+Fibo[i-2];
        }
        return Fibo[10];
    }

    public static void main(String[] args) {
        int[] a = {12,3,23,4,2,1};
//        printElement(a,0);
//        printElement2(a,0);
        System.out.println(Fibo3());
    }
}

