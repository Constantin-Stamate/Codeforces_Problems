package codeforces_2;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < t; i++) {
            String s = scan.next();
            verificationString(s);
        }
    }

    public static void verificationString(String s) {
        if (s.equalsIgnoreCase("YES")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
