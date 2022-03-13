
import java.util.Scanner;

public class pattern6 {

    public static void pattern6(int n){
        int nsp =  1;
        int nst = (n+1)/2;

        for(int r = 1;r<=n;r++){

            for(int cst = 1;cst<=nst;cst++){
                System.out.print("*\t");
            }

            for(int csp = 1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }
            //when we are at n =3 we should think of n=4 here , as line of 3 is printed and we are take care of condition of line 4;
            if(r <= n/2){
                nst--;
                nsp = nsp+2;
            }else{
                nst++;
                nsp = nsp-2;
            }

            System.out.println();


        }
        
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        pattern6(n);
    }
}
