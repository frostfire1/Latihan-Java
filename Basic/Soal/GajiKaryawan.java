import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        while (true) {
            System.out.print("Input Gaji Karyawan: Rp.");
            double total, bonus, awal = inpt.nextDouble();
            System.out.print("Karyawan Telah Bekerja selama? ");
            int tahun = inpt.nextInt();
            if (tahun >= 3) {
                bonus = 10.0 / 100.0 * awal;
            }
            else {
                bonus = 5.0 / 100.0 * awal;
            }
            total = awal + bonus;
            System.out.println("Bonus Karyawan adalah: " + bonus);
            System.out.println("Total gaji karyawan sekarang: " + total);
            System.out.print("\nMengulangi? tekan 1 untuk Mengulangi, 0 untuk berhenti:");
            int pil2 = inpt.nextInt();
            if(pil2 == 1){
                System.out.println("Menambah Data");
            }
            if(pil2 == 0){
                break;
            }
        }
    }
}