import java.util.Scanner ;

public class General{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in) ;

        int cnt1 = 0, cnt2 = 0, x = 9999999, y = -9999999 ;
        int n = scan.nextInt () ;
        int[] sir = new int[n] ;
        for (int i = 0; i < n; i++)
            sir[i] = scan.nextInt () ;

        for (int i = 0; i < n; i++)
            if (sir[i] <= x){
                x = sir[i] ;
                cnt1 = i ;
            }

        for (int i = n-1; i >= 0 ; i--)
            if (sir[i] >= y){
                y = sir[i] ;
                cnt2 = i ;
            }

        if (cnt1 < cnt2) System.out.println (cnt2 + (n - cnt1 - 2)) ;
        else
            System.out.println (cnt2 + (n - cnt1 - 1)) ;
    }
}
