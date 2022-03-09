import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class stringCompression {

    public static String stringCompression1(String  str){
        String s = "";

        s = s+str.charAt(0);
        for(int i=1;i<str.length();i++){
            char chforward = str.charAt(i);
            char chbackward = str.charAt(i-1);
            

            if(chforward != chbackward){
                s = s + chforward; 
            }
        }
        return s;
    }

    public static String stringCompression2(String  str){
        String s = "";
        int count = 1;

        s = s+str.charAt(0);
        for(int i=1;i<str.length();i++){
            char chforward = str.charAt(i);
            char chbackward = str.charAt(i-1);
            
        
           if(chforward != chbackward){
                if(count != 1)
                 s= s + count;
                count = 1;
                s = s + chforward; 
            }else{
                count++;   
            }


            
        }
        //after ending of loop we should add the count as to take care of the last digit.

        if(count != 1)
            s= s + count;
        return s;
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = stringCompression2(str);
        System.out.println(ans);
    }
}
