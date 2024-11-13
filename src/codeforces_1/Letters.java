package codeforces_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char b : a.toCharArray())
            if (b >= 'a' && b <= 'z') map.put(b, map.getOrDefault(b, 0) + 1);

        System.out.println(map.size());
    }
}
