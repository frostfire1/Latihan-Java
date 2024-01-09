import java.util.Scanner;

public class pembelian {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Jumlah Barang: ");
        int num1 = scn.nextInt();
        System.out.print("Input diskon: ");
        int dskn = scn.nextInt();
        int[] hargaindx = new int[20];
        String[] namaindx = new String[20];
        int[] jumlahindx = new int[20];
        int tot = 0;
        double hasil = 0;
        for (int i = 0; i < num1; i++ ) {
            int a = i +1;
            System.out.print("Input nama Barang " + a + " : ");
            String nama = scn.next();
            System.out.print("Input harga Barang " + a + " : Rp.");
            int num = scn.nextInt();
            System.out.print("Berapa " + nama + " : ");
            int numa = scn.nextInt();
            jumlahindx[i] = numa;
            hargaindx[i] = num * numa;
            namaindx[i] = nama;
        }
        for (int i = 0; i < num1; i++ ){
            tot += hargaindx[i];
        }
        Double dsknd = Double.valueOf(dskn);
        Double totd = Double.valueOf(tot);
        Double dsknh = dsknd / 100 * totd;
        hasil = totd - dsknh;
        System.out.println("===============================");
        for (int i = 0; i < num1; i++ ){
            System.out.printf("%-15s Rp.%d%n", namaindx[i] + " X " + jumlahindx[i] , hargaindx[i]);
        }
        System.out.println(" ");
        System.out.printf("%-15s Rp.%d%n", "Total", tot);
        System.out.println("Di Diskon " + dskn + "% = Rp." + hasil);
        System.out.println("===============================");
    }
}