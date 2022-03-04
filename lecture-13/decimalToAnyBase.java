import java.util. *;
public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
     }
    
     public static int getValueInBase(int n, int b){
         int dn=0;
         int tp = 1; // 10^0

        while(n >0){
            int rem = n%b;
            n = n/b;

            dn = dn + rem * tp;
            tp = tp *10;
            
        }
         return dn;
     }
}
