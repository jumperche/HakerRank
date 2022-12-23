import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContent {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner in = new Scanner ( System.in );
        int testCases = Integer.parseInt ( in.nextLine ( ) );
        boolean none=false;

        while ( testCases > 0 ) {
            String line = in.nextLine ( );
            String regex = "<(.+)>([^<>]+)<\\/\\1>";
            Pattern pattern = Pattern.compile ( regex );
            Matcher matcher = pattern.matcher ( line );

            while ( matcher.find ( ) ) {

                System.out.println ( matcher.group ( 2 ) );
                none = true;

            }

            if ( !none ) {

                System.out.println ( "None" );
            }

            none = false;
            testCases--;
        }
    }
}
