import java.util.*;
public class HW_printAllPrime{
    
    public static void  main(String[] args){

        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i=low;i<=high;i++){

         int  div = 2;
         boolean isprime = true;
         
          while(div*div <= i ){
            if(i%div == 0){
              isprime = false;
              break;
            }

            div++;
            
          }
          if(isprime==true)
            System.out.println(i);
          
    }
}
}
 