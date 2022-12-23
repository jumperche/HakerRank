import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale newLocale=new Locale("en","in");
        java.text.NumberFormat formatUS = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US);
        String us=formatUS.format(payment);
        java.text.NumberFormat formatIn = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("en","in"));
        String india=formatIn.format(payment);
        java.text.NumberFormat formatChina = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.CHINA);
        String china=formatChina.format(payment);
        java.text.NumberFormat formatFrance = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE);
        String france=formatFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " +formatIn.format (payment));
        System.out.println("China: " + formatChina.format(payment));
        System.out.println("France: " + formatFrance.format(payment));
    }

}
