import java.util.Scanner;

public class lectureThree {

    public static void printInReverseOrder(int num){
        while(num!=0){
            int lastdigit  = num %10;
            num = num /10;

            System.out.println(lastdigit);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printInReverseOrder(n);
    }
}
