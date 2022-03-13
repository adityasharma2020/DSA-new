import java.util.Scanner;

public class pattern7{
    public static void pattern7(int n){

        for(int r=1;r<=n;r++){


            for(int i=1;i<=n;i++){
                if(r+i==n+1 || i==r)
                    System.out.print("*\t");
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        pattern7(n);
    }
}