import java.util.Scanner;
public class KalkulatorSuhu{
    public static void main(String[] args) {
        double r,f,k;
        Scanner inpt = new Scanner(System.in);
        System.out.print("Input Celsius: ");
        double celci = inpt.nextDouble();
        r = 4.0/5.0 * celci;
        f = (9.0/5.0*celci) + 32.0;
        k = celci+273.15;
        System.out.println("Celsius ke Reamure   = " + r + "R");
        System.out.println("Celsius ke Farenheit = " + f + "F");
        System.out.println("Celsius ke Kelvin    = " + k + "K");
    }
}