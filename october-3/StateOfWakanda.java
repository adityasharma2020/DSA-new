import java.util.*;

public class StateOfWakanda {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int r = Scn.nextInt();
        int c = Scn.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = Scn.nextInt();

            }
        }

        for (int j = 0; j < c; j++) { // j means columns

            if (j % 2 == 0) {

                for (int i = 0; i < r; i++) { // i means rows
                    System.out.print(arr[i][j] + "\t");
                }
            } else {
                for (int i = r - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + "\t");
                }
            }

        }

    }
}
