import java.util.Scanner;

public class InitializerBlock {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int b = Integer.parseInt ( scanner.nextLine ( ) );
        int h = Integer.parseInt ( scanner.nextLine ( ) );
        if (b<=0||h<=0){
            System.out.printf ( "java.lang.Exception: Breadth and height must be positive" );

        } else {
            System.out.println (b*h );
        }
    }
}
