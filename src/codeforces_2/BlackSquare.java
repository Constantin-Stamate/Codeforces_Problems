package codeforces_2;

import java.util.Scanner;

public class BlackSquare {
    static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] sir = createArray();
        scan.nextLine();


        String s = scan.nextLine();
        System.out.println(numberOfCalories(sir, s));
    }

    public static int[] createArray() {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int numberOfCalories(int[] arr, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            count += arr[d-1];
        }
        return count;
    }
}
