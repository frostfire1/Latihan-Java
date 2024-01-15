import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Predikat {

    static Scanner inpt = new Scanner(System.in);
    static String pelajaran[] = {"Pendidikan Agama", "PKn", "Bahasa Indonesia", "Bahasa Inggris", "Matematika"};
    static double nilai = 0;
    static String nama, predikat = null;
    static double nilaipel[] = {0,0,0,0,0};

    public static void main(String[] args) {
        System.out.println("Memulai Program....");
        MakeFile();
        while (true) {
            System.out.println("1. Tambah Data Predikat \n2. Baca Histori Data Predikat\n0. Keluar");
            System.out.print("\nPilih Nomer  : ");
            int pil = inpt.nextInt();
            if (pil == 1) {
                predikat();
            } else if (pil == 2) {
                ReadData();
            } else if (pil == 0) {
                System.out.println("Program Berhenti.....");
                break;
            } else {
                System.out.println("Pilihan Tidak Ada");
            }
        }
    }
    private static void predikat() {
        Scanner inptstring = new Scanner(System.in).useDelimiter("\n");
        boolean loop = true;
        while (loop) {
            nilai = 0;
            System.out.print("Input Nama  : ");
            nama = inptstring.next();
            inptstring.nextLine();
            for (int i = 0; i <= 4; i++){
                System.out.print("Input Nilai " + pelajaran[i] + ": ");
                nilaipel[i] = inpt.nextDouble();
                nilai += nilaipel[i];
            }
            nilai /= 5;
            if(nilai <= 24 && nilai >= 0){
                predikat = "F";
            } else if (nilai >= 25 && nilai <= 45) {
                predikat = "E";
            } else if (nilai >= 46 && nilai <= 50) {
                predikat = "D";
            } else if (nilai >= 51 && nilai <= 60) {
                predikat = "C";
            } else if (nilai >= 61 && nilai <= 80) {
                predikat = "B";
            } else if (nilai >= 81 && nilai <= 100) {
                predikat = "A";
            } else {
                predikat = "INPOSIBLE";
            }
            System.out.println("===============================");
            System.out.println("Nama                  : " + nama);
            for(int i = 0; i <= 4; i++){
                System.out.println(pelajaran[i] + "      : " + nilaipel[i]);
            }
            System.out.println("Nilai Rata Rata       : " + nilai);
            System.out.println("Predikat              : " + predikat);
            System.out.println("===============================");
            System.out.println("Maaf sementara tidak Rapi karena Printf saya error");


            AddData();



            System.out.print("\nMengulangi? tekan 1 untuk Mengulangi, 0 untuk berhenti:");
            int pil2 = inpt.nextInt();
            if (pil2 == 1) {
                System.out.println("Menambah Data");
            }
            if (pil2 == 0) {
                loop = false;
            }
        }
    }

    private static void MakeFile(){
        try {
            File myObj = new File("Predikatdata.txt");
            if (myObj.createNewFile()) {
                System.out.println("File Data Predikat Dibuat: " + myObj.getName());
            } else {
                System.out.println("File Data sudah Ada");
            }
        } catch (IOException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
    //simpan file
    private static void AddData(){
        try {
            File f1 = new File("Predikatdata.txt");
            if(!f1.exists()) {
                MakeFile();
                System.out.println("\124ERROR: Silahkan Input\u001B");
            }
            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.newLine();
            bw.write("======================================");
            bw.newLine();
            bw.write("Nama             : " + nama);
            for (int i =0; i <= 4; i++){
                bw.write(pelajaran[i] + "      : " + nilaipel[i]);
                bw.newLine();
            }
            bw.write("Rata-rata Nilai  : " + nilai);
            bw.newLine();
            bw.write("Predikat         : " + predikat);
            bw.newLine();
            bw.write("======================================");
            bw.close();
        } catch(IOException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
    private static void ReadData() {
        System.out.println("");
        Path path = Paths.get("Predikatdata.txt");
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            lines.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ketik apa saja lalu enter untuk keluar");
        String gak_ada_apa_apa = inpt.next();
    }
}