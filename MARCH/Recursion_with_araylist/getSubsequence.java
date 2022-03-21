import java.util.Scanner;

public class getSubsequence{

     public static void main(String[] args){

    }

    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            String theSS = "";
            bres.add(theSS);
            return bres;
        }

        char ch = str.charAt();
        String ros = str.subString(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();


        for(String rstr : rres){
            mres.add(rstr);
        }

        for(String  rstr : rres){
            mres.add(ch+rstr);
        }


        return mres;
    }
}