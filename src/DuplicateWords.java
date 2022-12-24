import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5
//tap taptap For fOr for forfor
//taptap of kirethe the hte hTe hte
//tim tamtim tam tam ta tam tam
//a a a a a a a a a a a a a a a a
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

public class DuplicateWords {
    public static void main ( String[] args ) {
        String regex = "\\b(\\w+)( \\1\\b)+";
        Pattern p = Pattern.compile ( regex , Pattern.CASE_INSENSITIVE/* Insert the correct Pattern flag here.*/ );

        Scanner in = new Scanner ( System.in );
        int numSentences = Integer.parseInt ( in.nextLine ( ) );

        while ( numSentences > 0 ) {
            String input = in.nextLine ( );

            Matcher m = p.matcher ( input );

            // Check for subsequences of input that match the compiled pattern
            while ( m.find ( ) ) {
                String a=m.group(2);

                input = input.replaceAll ( m.group ( ) ,m.group (1) );
            }

            // Prints the modified sentence.
            System.out.println ( input );
            numSentences--;
        }

        in.close ( );
    }
}
