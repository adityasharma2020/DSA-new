import java.util.Scanner;

public class palindromicSubsting {
    
    public static boolean palindrome(String sub){
        boolean flag = true;

        int left = 0;
        int right = sub.length()-1;

        while(left < right){
            char chleft = sub.charAt(left);
            char chright = sub.charAt(right);

            if(chleft != chright){
                flag = false;
                return flag;
            }
           left++;
           right--;

        }

        return true;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for(int i=0;i< str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                
                String sub = str.substring(i,j);
                boolean ans = palindrome(sub);
                if(ans){
                System.out.println(sub);
            }
            }
        }

    }
}
