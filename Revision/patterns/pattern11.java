import java.util.Scanner;

public class pattern11{

    public static void pattern11(int n){

        int nst =1 ;
        for(int r=1;r<=n;r++){
        for(int cst=1;cst<=nst;nst++){
            System.out.print("*\t");
        }

        nst++;
        System.out.println();
        
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        pattern11(n);
    }
}