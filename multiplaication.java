import java.util.*;

public class multiplaication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[n][x];
        int[][] C = new int[m][x];
        System.out.println("A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < x; k++) {
                for (int j = 0; j < n; j++) {
                    C[i][k] += (A[i][j] * B[j][k]);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(C[i][j] + " ");
               
            }
            System.out.println();
        }

    }

}
