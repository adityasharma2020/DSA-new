import java.util.Scanner;

public class palindromicSubsting {
    public static void palindrome(String str){

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for(int i=0;i< str.length();i++){
            for(int j=i;j<=str.length();j++){
                String sub = str.substring(i,j);
                System.out.println(sub);
            }
        }

    }
}
