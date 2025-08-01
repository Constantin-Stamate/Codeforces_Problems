package codeforces_3;

import java.util.Scanner;

public class TrippiTroppi {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < t; i++) {
            String word = createWord();
            String result = extractInitials(word);
            System.out.println(result);
        }
    }

    public static String extractInitials(String word) {
        StringBuilder result = new StringBuilder();

        String[] words = word.split(" ");
        for (String w : words) {
            if (!w.isEmpty()) {
                result.append(w.charAt(0));
            }
        }

        return result.toString();
    }

    public static String createWord() {
        return scan.nextLine();
    }
}