import java.util.Scanner;

public class l006{
    public static Scanner scn = new Scanner(System.in);


    public static void printTables(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num * i);
        }
    }

    public static int sumOfTwoNumbers(){
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum  = a+b;
        
        return sum;
    }


    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i=2;i*i< num;i++){
            if(num%i==2){
               return false;
            }

        }
        return true;
    }

    public static void primeInRange(int a,int b,int num){
        for(int i =a;i<=b;i++){
        if(isPrime(num)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }

    }

   public static void main(String[] args){

    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    // int num2  = scn.nextInt();

    // for(int i=num;i<=num2;i++){
    //     printTables(i);
    //     System.out.println("\t");
    // }


    isPrime(num);

    int ans = sumOfTwoNumbers();
    System.out.println(ans);

   
   }
    
}