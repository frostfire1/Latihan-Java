import java.util.Scanner;

public class segitiga{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("1. Segitiga \n2. Persegi \n3. Batas Awal-Akhir \nPilih Berdasarkan Nomer: ");
        int pil = in.nextInt();
        if(pil == 1){
            segitiga();
        } else if (pil == 2) {
            persegi();
        } else if (pil == 3) {
            batas();
        }else {
            System.out.println("Tidak ada Pilihan");
        }
    }

    static void segitiga(){
        System.out.print("1. Soal 1 - Segitiga Kecil ke besar \n2. Soal 2 - Segitiga besar ke kecil \n3. Soal 3 - segitiga blank space \n4. Soal Segitiga sama sisi tumpul Vertikal \n5.Segitiga sama sisi Lancip Horizontal\nPilih Berdasarkan Nomer: ");
        int pil = in.nextInt();
        System.out.print("Input Panjang: ");
        int inpt = in.nextInt();
        switch (pil) {
            case 1:
            for (int i = 1; i <= inpt; i++) {
                for (int j = 1; i >= j; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
            case 2:
            for (int i = 1; i <= inpt; i++) {
                for (int k = inpt; k >= i; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            break;

            case 3:
                for (int i = 1; i <= inpt; i++) {
                    for (int k = inpt; k >= i; k--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 1; i <= inpt; i++) {
                    for (int j = 1; i >= j; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= inpt; i++) {
                    for (int j = 1; i >= j; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 1; i <= inpt; i++) {
                    for (int k = inpt; k >= i; k--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
            for (int i = 1; i <= inpt; i++) {
                for (int j = inpt; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                for (int l = 1; l < i; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
        }
    }

    static void persegi(){
        System.out.print("input Panjang: ");
        int p = in.nextInt();
        System.out.print("input lebar: ");
        int l = in.nextInt();

        for(int i = 1; i <= p; i++){
            for(int j = 1; j <= l; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void batas(){
        System.out.print("input awal: ");
        int p = in.nextInt();
        System.out.print("input akhir: ");
        int l = in.nextInt();

        for(int i = p; i <= l; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}