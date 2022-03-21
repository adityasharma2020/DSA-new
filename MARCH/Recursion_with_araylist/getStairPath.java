import java.util.Scanner;

public class getStairPath{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        ArrayList<String> paths = getStairPath(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPath(int n){
        if(){

        }

        ArrayList<String> pathsfromnm1 = getStairPath(n-1);
        ArrayList<String> pathsfromnm2 = getStairPath(n-2);
        ArrayList<String> pathsfromnm3 = getStairPath(n-3);

        ArrayList<String> pathfromn = new ArrayList<>();

        for(String pathfromnm1:pathsfromnm1){
            String pathfromn = 1+pathfromn1
            pathfromn.add(pathfromnm1);

        }

    } 
}