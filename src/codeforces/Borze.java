package codeforces;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String alp = scan.nextLine();

        System.out.println(decodeAlphabet(alp));
    }

    public static String decodeAlphabet(String alp) {
        int index = 0;
        String result = "";
        while (index < alp.length()) {
            if (index + 1 < alp.length() && alp.substring(index, index + 2).equals("-.")) {
                result += '1';
                index += 2;
            } else if (index + 1 < alp.length() && alp.substring(index, index + 2).equals("--")) {
                result += '2';
                index += 2;
            } else {
                result += '0';
                index += 1;
            }
        }
        return result;
    }
}
