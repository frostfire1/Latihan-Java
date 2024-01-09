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
            String nama, predikat = null, kriteria = null;
            System.out.print("Input Nama  : ");
            nama = inptstring.next();
            inptstring.nextLine();
            System.out.print("Input Nilai : ");
            int nilai = inpt.nextInt();

            if (nilai >= 91 && nilai <= 100) {
                kriteria = "Sangat Baik";
                if (nilai >= 96 && nilai <= 100) {
                    predikat = "A";
                } else if (nilai >= 91 && nilai <= 95) {
                    predikat = "A-";
                }
            } else if (nilai >= 75 && nilai <= 90) {
                kriteria = "Baik";
                if (nilai >= 86 && nilai <= 90) {
                    predikat = "B+";
                } else if (nilai >= 81 && nilai <= 85) {
                    predikat = "B";
                } else if (nilai >= 75 && nilai <= 80) {
                    predikat = "B-";
                }
            } else if (nilai >= 60 && nilai <= 74) {
                kriteria = "Cukup";
                if (nilai >= 70 && nilai <= 74) {
                    predikat = "C+";
                } else if (nilai >= 65 && nilai <= 69) {
                    predikat = "C";
                } else if (nilai >= 60 && nilai <= 64) {
                    predikat = "C-";
                }
            } else if (nilai >= 0 && nilai <= 59) {
                kriteria = "Kurang";
                if (nilai >= 55 && nilai <= 59) {
                    predikat = "D+";
                } else {
                    predikat = "D";
                }
            } else {
                kriteria = "IMPOSIBLE";
                predikat = "INPOSIBLE";
            }
            System.out.println("===============================");
            System.out.println("Nama         : " + nama);
            System.out.println("Nilai        : " + nilai);
            System.out.println("Predikat     : " + predikat);
            System.out.println(kriteria);
            System.out.println("===============================");
            AddData(nama, String.valueOf(nilai), predikat, kriteria);
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
    private static void AddData(String nama,String Nilai, String Predikat, String Kriteria){
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
            bw.newLine();
            bw.write("Nilai            : " + Nilai);
            bw.newLine();
            bw.write("Predikat         : " + Predikat);
            bw.newLine();
            bw.write(Kriteria);
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