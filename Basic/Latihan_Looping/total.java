import java.util.Scanner;

public class total {
    //:")
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int total = 0, awal, akhir;
        System.out.print("Input Nilai Awal: ");
        awal = inpt.nextInt();
        System.out.print("Input Nilai Akhir: ");
        akhir = inpt.nextInt();
        for(int i = awal; i <= akhir; i++){
            System.out.println(total + " + " + i + " = " + (total += i));
        }
    }
}