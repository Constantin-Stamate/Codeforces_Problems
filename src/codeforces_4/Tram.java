package codeforces_4;

import java.util.Scanner;

public class Tram {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(maxPassengers(n));
    }

    private static int maxPassengers(int n) {
        int current = 0, max = 0;
        for (int i = 0; i < n; i++) {
            current = updatePassengers(current);
            max = Math.max(max, current);
        }
        return max;
    }

    private static int updatePassengers(int current) {
        int out = sc.nextInt();
        int in = sc.nextInt();
        return current - out + in;
    }
}