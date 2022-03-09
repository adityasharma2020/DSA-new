import java.util.Scanner;


    public class rotate{


        public static int RotateNumber(int n,int k){
          int len =0;
          int temp = n;
         while(temp!= 0){
            temp = temp/10;
            len++;
          }
          k = (k%len+len)%len;
   
          int a = n%((int)Math.pow(10,k)) * ((int)Math.pow(10,len-k));
          int b = n/((int)Math.pow(10,k));
          return (a+b);
        }
      
      public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int k = scn.nextInt();
         int ans = RotateNumber(n,k);
         System.out.println(ans);
   
       }
}

