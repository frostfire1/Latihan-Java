import java.util.Scanner;

public class KWH {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Input Nama: ");
        String name = inpt.nextLine();
        System.out.print("Input besar KWH: ");
        double pemakaian = inpt.nextInt(),tarif = 0,rumus,admin;

        if (pemakaian >= 0 && pemakaian <= 50.0){
            tarif = 100.0;
        } else if (pemakaian >= 51.0 && pemakaian <= 150.0) {
            tarif = 150.0;
        } else if (pemakaian >= 151.0 && pemakaian <= 250.0) {
            tarif = 250.0;
        } else if (pemakaian > 250.0) {
            tarif = 300.0;
        }
        rumus = pemakaian * tarif;
        admin = 0.2 * rumus;
        double hasil = admin + rumus;
        System.out.println("===============================");
        System.out.println("Nama    : " + name);
        System.out.println("Biaya   : " + rumus);
        System.out.println("Biaya Admin: " + 20 + "% = Rp." + hasil);
        System.out.println("===============================");
    }
}