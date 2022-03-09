import java.util.Scanner;

public class pattern5 {
    public static void pattern5a(int n ){

        int nsp = n;
        int nst = 1;

        for(int r = 1;r<=n;r++){
            for(int csp = 1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            for(int cst = 1;cst<=nst;cst++){
                System.out.print("*\t");
            }

            nsp--;
            nst = nst+2;
            System.out.println();
        }
    }

    public static void pattern5b(int n ){

        int nsp = 0;
        int nst = 2*n - 1;

        for(int r = 1;r<=n;r++){
            for(int csp = 1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            for(int cst = 1;cst<=nst;cst++){
                System.out.print("*\t");
            }

            nsp++;
            nst = nst-2;
            System.out.println();
        }
    }

    public static void pattern5_diamond(int n){
        int nsp = n/2; int nst = 1;

        for(int r=1;r<=n;r++){

            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }
            if(r <= n/2){
            nsp--;
            nst = nst +2;
            }else{
                nsp++;
                nst = nst -2;
            }
            System.out.println();
        }
    }

    


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern5_diamond(n);
    }   
}
