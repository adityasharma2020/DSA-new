import java.util.Scanner;

public class pattern1 {
        // nsp = number of spaces
        // nst = number of stars

        

        public static void pattern1(int n){

            int nsp = n;
            int nst = n;

            for(int r=1;r<=n;r++){


                for(int csp=1;csp<=nsp;csp++){
                    System.out.print("\t");
                }


                for(int cst=1;cst<=nst;cst++){
                    System.out.print("*\t");
                }


                nsp = nsp+0;
                nst = nst +0;
                System.out.println();


            }

            
        }
        public static void main(String[]args){
            Scanner scn = new Scanner(System.in);
            int n  = scn.nextInt();
            pattern1(n);

        }
}
