package codeforces_3;

import java.util.HashSet;
import java.util.Scanner;

public class PolycarpLikedNumbers {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            System.out.println(countLikedNumbers(n));
        }
    }

    public static int countLikedNumbers(int n) {
        HashSet<Integer> likedNumbers = new HashSet<>();

        for (int i = 1; i * i <= n; i++) {
            likedNumbers.add(i * i);
        }

        for (int i = 1; i * i * i <= n; i++) {
            likedNumbers.add(i * i * i);
        }

        return likedNumbers.size();
    }
}