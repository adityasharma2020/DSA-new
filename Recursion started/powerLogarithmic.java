import java.util.Scanner;

public class powerLogarithmic(int x.,int n){
    if(n==0){
        return 1;

    }

    int xpb2 = power(x,n/2);
    int xpn = xpb2 *xpb2;

    if(n%2 == 1 ){
        xpn = xpn *x;
    }

    return xpn;
}


    public static void main(String[] args){
        SCanner scn = new Scanner(System.in);

    }
}