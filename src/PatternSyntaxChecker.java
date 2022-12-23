import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int testCases = Integer.parseInt ( in.nextLine ( ) );
        while ( testCases > 0 ) {
            String pattern = in.nextLine ( );
            boolean error = false;
            //Write your code

            try {
                Pattern pat = Pattern.compile ( pattern );
                Matcher m = pat.matcher ( pattern );
            } catch (PatternSyntaxException pse) {
                System.out.println ( "Invalid" );
                error = true;

            }

            if ( !error ) {
                System.out.println ( "Valid" );
            }
            testCases = testCases - 1;

        }



    }
}
