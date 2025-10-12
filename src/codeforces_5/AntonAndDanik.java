package codeforces_5;

import java.util.Scanner;

public class AntonAndDanik {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();
        printWinner(countWins(s));
    }

    private static int[] countWins(String s) {
        int a = 0, d = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') a++;
            else d++;
        }
        return new int[]{a, d};
    }

    private static void printWinner(int[] res) {
        if (res[0] > res[1]) System.out.println("Anton");
        else if (res[1] > res[0]) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}