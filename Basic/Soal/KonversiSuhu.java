import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        double hasil;
        System.out.print("Input Nilai Celsius: ");
        double celci = inpt.nextDouble();
        System.out.println("Input F untuk Mengkonversi ke Fahrenheit\nInput K untuk Mengkonversi ke Kelvin\nInput R untuk Mengkonversi ke Reamur");
        System.out.print("Input PIlihan: ");
        char pilihan = inpt.next().charAt(0);

        switch (Character.toUpperCase(pilihan)){
            case 'F':
                hasil = (9.0/5.0*celci) + 32.0;
                System.out.println("Farenheit = (9.0/5.0 *" + celci + ") + 32.0 = " + hasil + "F");
                break;
            case 'K':
                hasil = celci+273.15;
                System.out.println("Kelvin = "+ celci +" + 273.15 = " + hasil + "K");
                break;
            case 'R':
                hasil = 4.0/5.0 * celci;
                System.out.println("Reamur = 4.0/5.0 * " + celci +" = " + hasil + "R");
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }
    }
}