import java.util.Scanner;

public class pengaturankeuangan {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Input Bulan: ");
        String bln = inpt.nextLine();
        double saku,bensin,jajan,hiburan;
        System.out.print("Input Uang Saku: ");
        saku = inpt.nextDouble();
        System.out.print("Input Budget bensin: ");
        bensin = inpt.nextDouble();
        System.out.print("Input Budget jajan: ");
        jajan = inpt.nextDouble();
        System.out.print("Input Budget Hiburan: ");
        hiburan = inpt.nextDouble();

        System.out.println("Tabungan untuk Kuliah: Rp." + (0.6 * (saku - bensin - jajan - hiburan)));
        System.out.println("Tabungan untuk Laptop: Rp." + (0.4 * (saku - bensin - jajan - hiburan)));

    }
}