import java.util.Scanner;

public class anyBaseToAnyBase {

    public static int anyBaseToDecimal(int n, int b){
        int dn=0;
        int bp=1;

        while(n >0){
            int rem = n%10;
            n  = n /10;

            dn = dn + rem * 10;
            bp = bp  * b;
        }

        return dn;
    }

    public static int decimalToAnyBase(int n , int b){
    int bn =0;
    int tp = 0;

    while(n>0){
        int rem = n %b;
        n = n/b;

        bn = bn + rem * tp;
        tp = tp *10;
    }
    return  bn;
}

    public static int anyBaseToAnyBaseConvert(int n, int sourceBase, int destBase){
        int ad = anyBaseToDecimal(n, sourceBase);
        int da = decimalToAnyBase(ad, destBase);
        return da;

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
       int  destBase= scn.nextInt();

     int  ans = anyBaseToAnyBaseConvert(n,sourceBase,destBase);
     System.out.println(ans);

     }   
}
