import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // int tableNumber = 7;

        // for(int i = 1; i <= 10; i++) {

        //     System.out.println(tableNumber + "X" + i + "=" + tableNumber * i);
        // }


        Scanner scn = new Scanner(System.in);
        boolean isPrime = true;
        int num = scn.nextInt();

        for(int i=2;i< num;i++){
            if(num%2 == 0){
                isPrime = false;
                break;
            }
        
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
