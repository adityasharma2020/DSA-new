public static int getValueIndecimal(int n, int b){
        int dn=0;
        int bp = 1 ;
        while(n >0){
            int rem = n % b;
            n = n/10;

            dn = dn +rem *bp;
            bp = bp * b;
        }

        return dn;
     }