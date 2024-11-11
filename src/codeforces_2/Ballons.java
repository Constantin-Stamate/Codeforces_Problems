package codeforces_2;

import java.util.Scanner;

public class Ballons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();

            char[] arr = createCharArray(s);
            boolean[] visited = recordCharacter();
            System.out.println(numberOfPoints(arr, visited));
        }
    }

    public static char[] createCharArray(String s) {
        return s.toCharArray();
    }

    public static boolean[] recordCharacter() {
        return new boolean[128];
    }

    public static int numberOfPoints(char[] arr, boolean[] visited) {
        int count = 0;
        for (char ch : arr) {
            if (!visited[ch]) {
                count += 2;
                visited[ch] = true;
            }
            else {
                count++;
            }
        }
        return count;
    }
}
