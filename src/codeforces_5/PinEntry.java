package codeforces_5;

import java.util.Scanner;

public class PinEntry {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            String pin = readPin();
            System.out.println(minSeconds(pin));
        }
    }

    private static String readPin() {
        return scan.nextLine();
    }

    private static int minSeconds(String pin) {
        int time = 4;
        for (int i = 1; i < pin.length(); i++) {
            int prev = pin.charAt(i - 1) - '0';
            int cur = pin.charAt(i) - '0';
            time += circularDist(prev, cur);
        }
        return time;
    }

    private static int circularDist(int a, int b) {
        int diff = Math.abs(a - b);
        return Math.min(diff, 10 - diff);
    }
}