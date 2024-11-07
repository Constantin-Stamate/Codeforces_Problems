package codeforces1;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < t; i++) {
            String a = scan.next();
            String b = scan.next();

            char[] arr1 = transformString(a);
            char[] arr2 = transformString(b);

            creatingWords(arr1, arr2);
        }
    }

    public static void creatingWords(char[] arr1, char[] arr2) {
        char c1 = arr1[0];
        char c2 = arr2[0];

        if (c1 == c2) System.out.println(new String(arr1) + " " + new String(arr2));
        else {
            arr1[0] = c2;
            arr2[0] = c1;
            String rez = "%s %s".formatted(new String(arr1), new String(arr2));
            System.out.println(rez);
        }
    }

    public static char[] transformString(String f) {
        return f.toCharArray();
    }
}
