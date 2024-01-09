import java.util.Scanner;

public class GanjilGenap{
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Input Nilai: ");
        int a = inpt.nextInt();
        if(a % 2 == 0) {
            System.out.println(a + " adalah Genap");
        }
        else {
            System.out.println(a + " adalah Ganjil");
        }
    }
}