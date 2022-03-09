import java.util.Scanner;
public class pattern6 {

    public static void pattern6(int n){
        int nst = n/2;
        int nsp=1;
        

        for(int r =1;r<=n;r++){

            if(r== n/2+1){
                nst = 1;
                nsp = n-2;
            }
            
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }

            for(int csp =1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            for(int cst =1;cst<=nst;cst++){
                System.out.print("*\t");
                
            }
            System.out.print("nst : "+nst);
            System.out.print("r is : "+r);
            if(r<= n/2){
            nst--;
            nsp += 2;
            }
            
            else if(r>n/2){
              
                nst++;
                nsp -= 2;
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
