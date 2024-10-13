package codeforces;

import java.util.HashMap ;
import java.util.Scanner ;

public class Pangram {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in) ;
        int n = scan.nextInt () ;
        scan.nextLine() ;
        String s = scan.nextLine() ;

        HashMap <Character, Integer> map = new HashMap <> () ;
        for (char c : s.toCharArray()) {
            map.put (Character.toLowerCase(c), map.getOrDefault (Character.toLowerCase(c), 0) + 1) ;
        }

        int r = map.size() ;
        if (r == 26) System.out.println ("YES") ;
        else System.out.println ("NO") ;
    }
}