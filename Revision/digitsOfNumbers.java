import java.util.Scanner;
public class digitsOfNumbers {
    

    

        // public static int reverse(int n){
        //     int ans = 0;
        //     while(n!=0){
  
        //       ans = (ans*10)+ n%10;
        //        n  = n/10;
        //     }
           
        //   return ans;
        //   }
  
        public static int length(int n){
          int ans=0;
          while(n!=0){
            n=n/10;
            ans++;
          }
          return ans;
        }
          public static void digitsOfNumber(int n){
            int len = length(n);
            while(len >0){
              int digit = n /(int)(Math.pow(10,len-1));
               n = n%(int) (Math.pow(10,len-1));
              System.out.println(digit);
              len--;
            }
            
          }
  
  
          public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
  
  
            digitsOfNumber(n);
           
          }
}


