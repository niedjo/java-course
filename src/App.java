import java.text.NumberFormat;


public class App {
    public static void main(String[] args) throws Exception {
        // constants

        final float PI = 3.14F; //example of declarations of constants

        String x = "1";

        int y = Integer.parseInt(x); //the same method exsist for byte, short, int, long, float, double or chart and string
        // arithmatic expressions
        double result = (double)10 / (double)3; // coasting

        System.out.println(result);


        // formatting number

        NumberFormat percent = NumberFormat.getPercentInstance();

        String resultCurrency = percent.format(0.891);

        System.out.println(resultCurrency);
    }
}
