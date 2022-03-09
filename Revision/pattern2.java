import java.util.Scanner;

public class pattern2 {
    public static void pattern2(int n){

        int nsp = 0;
        int nst = n;

        for(int r=0;r<=n;r++){

            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }

            for(int csp =1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            nsp++;
            nst--;
            System.out.println();

        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n =  scn.nextInt();
        pattern2(n);
    }
}
