import java.math.BigDecimal;
import java.util.Scanner;

public class BigInteger {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String[] s=new String[n];
        for ( int i = 0 ; i < n ; i++ ) {

            String x=scanner.nextLine ();
            s[i]=x;


        }
        for ( int i = 0 ; i < s.length ; i++ ) {
            for ( int j = i ; j >=1  ; j-- ) {



                if ( new BigDecimal ( s[j] ).compareTo ( new BigDecimal ( s[j-1] ) ) > 0 ) {
                    String helper = s[ j ];
                    s[ j ] = s[ j- 1 ];
                    s[ j- 1 ] = helper;
                }
                else {
                    break;
                }

            }
        }

        for ( int i = 0 ; i < s.length ; i++ ) {
            System.out.println (s[i] );
        }
    }
}
