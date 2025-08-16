package codeforces_3;

import java.util.Scanner;

public class BeautifulMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int row = -1, col = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(minMovesToCenter(row, col));
    }

    static int minMovesToCenter(int row, int col) {
        int centerRow = 2, centerCol = 2;
        return Math.abs(row - centerRow) + Math.abs(col - centerCol);
    }
}