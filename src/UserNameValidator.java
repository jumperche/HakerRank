import java.util.Scanner;
import java.util.regex.Pattern;

public class UserNameValidator {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt ( scan.nextLine ( ) );
        while ( n-- != 0 ) {
            String userName = scan.nextLine ( );

            if ( userName.matches ( Test.UsernameValidator.regularExpression ) ) {
                System.out.println ( "Valid" );
            } else {
                System.out.println ( "Invalid" );
            }
        }


    }
    class UsernameValidator {
        /*
         * Write regular expression here.
         */



        public static final String regularExpression ="^[A-Za-z](\\w){7,29}$" ;
    }
}
