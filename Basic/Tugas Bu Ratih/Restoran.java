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
import java.util.ArrayList;
import java.util.List;

public class Restoran {

    static Scanner inpt = new Scanner(System.in);
    List<String> Pembelian = new ArrayList<>();
    List<int> UangPembelian = new ArrayList<>();
    List<String> menu = new ArrayList<>();
    List<int> harga = new ArrayList<>();

    public static void main(String[] args) {
        MakeFile();
        while (true){
            System.out.println("1. Tambah Pembelian \n2. Baca Histori Pembelian \n3. Edit Menu \n0. Keluar");
            System.out.print("\nPilih Nomer  : ");
            int pil = inpt.nextInt();
            if(pil == 1){
                Beli();
            }
            else if (pil == 2) {
                ReadData();
            }
            else if (pil == 0) {
                System.out.println("Program Berhenti.....");
                break;
            }
            else {
                System.out.println("Pilihan Tidak Ada");
            }
        }
    }

    //Pembelian
    private static void Beli(){
        boolean loop = true;
        Scanner inptstring = new Scanner(System.in).useDelimiter("\n");
        while (loop) {
            //Inisialisasi variable
            String nama, kategori;
            kategori = null;
            double tinggi,tinggifiks,berat,IMT;

            //Input
            System.out.print("Input Nama        : ");
            nama = inptstring.next();
            inptstring.nextLine();
            System.out.print("Input Berat Badan : ");
            berat = inpt.nextDouble();
            System.out.print("Input Tinggi Badan : ");
            tinggi = inpt.nextDouble();

            //proses
            tinggifiks = tinggi / 100.0;
            IMT = berat / (tinggifiks*tinggifiks);

            //Pemilihan
            if (IMT < 17.0){
                kategori = "Kurus Berat";
            } else if (IMT >= 17 && IMT <= 18.5) {
                kategori = "Kurus Ringan";
            } else if (IMT > 18.5 && IMT <= 25) {
                kategori = "Normal";
            } else if (IMT > 25 && IMT <= 27) {
                kategori = "Gendut Ringan";
            } else if (IMT > 27) {
                kategori = "Gendut Berat";
            }
            //output
            System.out.println("===============================");
            System.out.println("Nama         : " + nama);
            System.out.println("Berat Badan  : " + berat);
            System.out.println("Tinggi Badan : " + tinggi);
            System.out.println("BMI          : " + IMT);
            System.out.println(kategori);
            System.out.println("===============================");

            //save ke file BMIdata.txt
            AddData(nama, String.valueOf(berat), String.valueOf(tinggi), String.valueOf(IMT), kategori);

            //pemilihan loop
            System.out.print("\nMengulangi? tekan 1 untuk Mengulangi, 0 untuk berhenti:");
            int pil2 = inpt.nextInt();
            if(pil2 == 1){
                System.out.println("Menambah Data");
            }
            if(pil2 == 0){
                loop = false;
            }
        }
    }

    private static void MakeFile(){
        try {
            File myObj = new File("Pembelian.txt");
            File menu = new File("Menu.txt");
            if (myObj.createNewFile()) {
                System.out.println("File Histori Pembelian Dibuat: " + myObj.getName());
            }if (menu.createNewFile()){
                System.out.println("File Menu Dibuat: " + myObj.getName());
            }else {
                System.out.println("File sudah Ada");
            }
        } catch (IOException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
    private static void AddData(String Nama,String Menu,){
        try {
            File f1 = new File("Pembelian.txt");
            if(!f1.exists()) {
                MakeFile();
                System.out.println("\124ERROR: Silahkan Input\u001B");
            }
            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write("======================================");
            bw.newLine();
            bw.write("Nama         : " + nama);
            bw.newLine();
            bw.write("Berat Badan  : " + berat);
            bw.newLine();
            bw.write("Tinggi Badan : " + tinggi);
            bw.newLine();
            bw.write("BMI          : " + BMI);
            bw.newLine();
            bw.write(Kategori);
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
        Path path = Paths.get("BMIdata.txt");
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            lines.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ketik apa saja lalu enter untuk keluar");
        String gak_ada_apa_apa = inpt.next();
    }
    private static void ReadMenu(){

    }
    private static void EditMenu(){

    }
}