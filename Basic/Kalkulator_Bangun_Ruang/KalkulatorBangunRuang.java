import java.util.Scanner;

public class KalkulatorBangunRuang {
    static Scanner inpt = new Scanner(System.in);
    static double Luas,Volume;
    public static void main(String[] args) {
        while(true) {
            System.out.println("\u001B[0m Kubus \n2. Balok\n3. Limas Segi Empat\n4. Bola\n5. Prisma Segitiga\n6. Tabung\n7.Kerucut\n0. Keluar");
            System.out.print("\nPilih Nomer  : ");
            int pil = inpt.nextInt();
            if (pil == 1) {
                Kubus();
            }
            if (pil == 2) {
                Balok();
            }
            if (pil == 3) {
                Limas();
            }
            if (pil == 4) {
                Bola();
            }
            if (pil == 5) {
                Prisma();
            }
            if (pil == 6) {
                Tabung();
            }
            if (pil == 7) {
                Kerucut();
            }
            if (pil == 0) {
                break;
            }
            System.out.print("\nMengulangi? tekan 1 untuk Mengulangi, 0 untuk berhenti:");
            int pil2 = inpt.nextInt();
            if(pil2 == 1){
                System.out.println("Mengulangi");
            }
            if(pil2 == 0){
                System.out.println("Good Bye.......");
                break;
            }
        }
    }
    private static void Bola() {
        System.out.print("Input Jari Jari: ");
        double jarijari = inpt.nextDouble();
        Luas = Math.PI * 4.0 * jarijari * jarijari;
        Volume = Math.PI * 4.0 / 3.0 * jarijari * jarijari * jarijari;
        System.out.println("\033[0;1m"+"Luas Bola   : " + Luas);
        System.out.println("\033[0;1m"+"Volume Bola : " + Volume);
    }
    private static void Kubus() {
        System.out.print("Input Rusuk  : ");
        double Rusuk = inpt.nextDouble();
        Luas = Rusuk * Rusuk * 6.0;
        Volume = Rusuk * Rusuk * Rusuk;
        System.out.println("\033[0;1m"+"Luas Kubus   : " + Luas);
        System.out.println("\033[0;1m"+"Volume Kubus : " + Volume);
    }
    private static void Balok() {
        System.out.print("Input Panjang : ");
        double p = inpt.nextDouble();
        System.out.print("Input lebar   : ");
        double l = inpt.nextDouble();
        System.out.print("Input Tinggi  : ");
        double t = inpt.nextDouble();
        Luas = l * p;
        Volume = p * l * t;
        System.out.println("\033[0;1m"+"Luas Balok: " + Luas);
        System.out.println("\033[0;1m"+"Volume Balok: " + Volume);
    }
    private static void Limas() {
        System.out.print("Input Panjang Alas : ");
        double p = inpt.nextDouble();
        System.out.print("Input lebar Alas   : ");
        double l = inpt.nextDouble();
        System.out.print("Input Tinggi       : ");
        double t = inpt.nextDouble();
        Volume = p * l * t / 3.0;
        System.out.println("\033[0;1m"+"Volume Limas SegiEmpat: " + Volume);
    }
    private static void Prisma() {
        System.out.print("Input Panjang Alas        : ");
        double p = inpt.nextDouble();
        System.out.print("Input Tinggi Alas         : ");
        double t = inpt.nextDouble();
        System.out.print("Input Tinggi Bangun Ruang : ");
        double T = inpt.nextDouble();
        Volume = p * t * T / 2.0;
        System.out.println("\033[0;1m"+"Volume Prisma Segitiga: " + Volume);
    }
    private static void Tabung() {
        System.out.print("Input Jari Jari : ");
        double jarijari = inpt.nextDouble();
        System.out.print("Input Tinggi    : ");
        double t = inpt.nextDouble();
        Volume = Math.PI * jarijari * jarijari * t;
        System.out.println("\033[0;1m"+"Volume Tabung: " + Volume);
    }
    private static void Kerucut() {
        System.out.print("Input Jari Jari : ");
        double jarijari = inpt.nextDouble();
        System.out.print("Input Tinggi    : ");
        double t = inpt.nextDouble();
        Volume = Math.PI * jarijari * jarijari * t / 3.0;
        System.out.println("\033[0;1m"+"Volume Kerucut: " + Volume);
    }
}


