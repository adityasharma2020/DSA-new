import java.util.*;

public class ExitPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int i = 0;
        int j = 0;
        int dir = 0; // 0 is east , 1 is south , 2 is west, 4 is north.

        while (true) { // as their are multiple conditions we put true in while and check all the
                       // conditions inside while and exit the loop using break condition.
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) {
                j++;
                if (j == arr[0].length) {
                    j--;
                    break;
                }
            } else if (dir == 1) {
                i++;
                if (i == arr.length) {
                    i--;
                    break;
                }
            } else if (dir == 2) {
                j--;
                if (j == -1) {
                    j++;
                    break;
                }
            } else if (dir == 3) {
                i--;
                if (i == -1) {
                    i++;
                    break;
                }
            }
            

        }
        System.out.println(i);
        System.out.println(j);

    }
}
