package codeforces_2;

import java.util.Scanner;

public class Bag {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = createBagsOfCandies();
        if (canShareEqually(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int[] createBagsOfCandies() {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static boolean canShareEqually(int[] arr) {
        int sum = arr[0] + arr[1] + arr[2] + arr[3];
        if (sum % 2 != 0) {
            return false;
        }
        return  (arr[0] + arr[1] == arr[2] + arr[3]) ||
                (arr[0] + arr[2] == arr[1] + arr[3]) ||
                (arr[0] + arr[3] == arr[1] + arr[2]) ||
                (arr[0] + arr[1] + arr[2] == arr[3]) ||
                (arr[0] + arr[1] + arr[3] == arr[2]) ||
                (arr[0] + arr[2] + arr[3] == arr[1]) ||
                (arr[1] + arr[2] + arr[3] == arr[0]);
    }
}
