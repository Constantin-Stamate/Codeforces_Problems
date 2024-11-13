package codeforces_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Joke {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        if (a.length() + b.length() != c.length()) System.out.println("NO");
        else {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            Map<Character, Integer> tap = new HashMap<Character, Integer>();

            for (char f : a.toCharArray())
                map.put(f, map.getOrDefault(f, 0) + 1);

            for (char p : b.toCharArray())
                map.put(p, map.getOrDefault(p, 0) + 1);

            for (char p : c.toCharArray())
                tap.put(p, tap.getOrDefault(p, 0) + 1);

            boolean q = false;

            for (char key : map.keySet())
                if (!map.get(key).equals(tap.get(key))) {
                    q = true;
                    break;
                }

            String h = q ? "NO" : "YES";
            System.out.println(h);
        }
    }
}
