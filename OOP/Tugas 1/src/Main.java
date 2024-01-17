import utils.File;
import utils.Kelas;
import utils.Sekolah;
import utils.Siswa;

import java.lang.reflect.Type;
import java.util.Scanner;



public class Main {
    static init.Sekolah sekolah = new init.Sekolah();
    static init.Kelas kelas = new init.Kelas();
    static init.Siswa siswa = new init.Siswa();
    static Scanner inpt = new Scanner(System.in);


    public static void main(String[] args) {
        //Load File
        sekolah.setSekolah(File.loadSekolah());
        kelas.setKelas(File.loadKelas());
        siswa.setSiswa(File.loadSiswa());
        //Testing();
        int pilihan1;
        //Loop Program
        while(true) {
            System.out.println("Basic simple program Database Sekolah");
            System.out.println("0. Tutup Program");
            System.out.println("1. List Sekolah");
            System.out.println("2. list semua Kelas di Database");
            System.out.println("3. list Semua Siswa di Database");
            pilihan1 = inpt.nextInt();
            if (pilihan1 == 1) {
                pemilihan1();
            }
            if(pilihan1 == 2) {
                listKelas();
            }
            if(pilihan1 == 3){
                listSiswa();
            }
            if(pilihan1 == 0) {
                System.out.println("Saving Data");
                File.saveSekolah(sekolah.getsekolahArrayList());
                File.saveKelas(kelas.getArrayList());
                File.saveSiswa(siswa.getArrayList());
                System.out.println("Good Bye....");
                break;
            }
        }
    }

    static void listSekolah(){
        System.out.println("==========List Sekolah==========");
        int i = 1;
        for (Sekolah listsekolah : sekolah.getsekolah()){
            System.out.println(i + ". " + listsekolah.N);
            i++;
        }
    }

    static void listKelas(){
        System.out.println("==========List Kelas==========");
        int i = 1;
        for (Kelas listkelas : kelas.getArrayList()){
            System.out.printf("%d. %10s (%s)",i,listkelas.Nama,listkelas.skull.N);
            i++;
        }
    }

    static void listSiswa(){
        System.out.println("==========List Siswa==========");
        int i = 1;
        for (Siswa listsiswa : siswa.getArrayList()){
            System.out.printf("%d. %10s %10s  %s",i,listsiswa.N,listsiswa.k.Nama,listsiswa.k.skull.N);
            i++;
        }
    }

    static void KelasDiSekolah(String NamaSekolah){
        System.out.println("==========List Kelas di Sekolah==========");
        String[] LiskKelas = kelas.searchKelasBySekolah(NamaSekolah);
        int i = 1;
        for (String list : LiskKelas){
            System.out.println( i + ". " + list);
            i++;
        }
        System.out.println("Pilih Nomer kelas untuk melihat informasi");
        System.out.println("0. Untuk kembali");
        System.out.println(LiskKelas.length + 1 + ". Untuk Menambahkan Data");
        Sekolah[] k = sekolah.getsekolah();
        int pilihan = inpt.nextInt();
        if (pilihan > 0 && pilihan <= LiskKelas.length) InfoKelas(LiskKelas[--i]);
        if (pilihan == LiskKelas.length + 1){
            for(Sekolah inpo : k) {
                if (inpo.N.equals(NamaSekolah)) {
                    System.out.println("Input Nama Kelas: ");
                    inpt.next();
                    kelas.addKelas(new Kelas(inpt.nextLine(),inpo));
                }
            }
            System.out.println("Data Sudah Ditambah");
            System.out.println();
            KelasDiSekolah(NamaSekolah);
        }
        else{
            System.out.println("Pilihan tidak ada");
            KelasDiSekolah(NamaSekolah);
        }
    }
    static void SiswaDiKelas(String NamaKelas){
        System.out.println("==========List Siswa di Kelas==========");
        String[] ListSiswa = siswa.searchSiswaByKelas(NamaKelas);
        int i = 1;
        for (String list : ListSiswa){
            System.out.println(i + ". " + list);
            i++;
        }

    }

    static void SiswaDiSekolah(String NamaSekolah){
        System.out.println("==========List Siswa di Sekolah==========");
        String[] ListSiswa = siswa.searchSiswaBySekolah(NamaSekolah);
        int i = 1;
        for (String list : ListSiswa){
            System.out.println(i + ". " + list);
            i++;
        }
    }

    static void InfoSekolah(utils.Sekolah inpo){
        String[] ListSiswa = siswa.searchSiswaBySekolah(inpo.N);
        String[] ListKelas = kelas.searchKelasBySekolah(inpo.N);
        System.out.println("=======INFO Sekolah=======");
        System.out.println("Nama         : " + inpo.N);
        System.out.println("Jumlah Kelas : " + ListKelas.length);
        System.out.println("Jumlah Siswa : " + ListSiswa.length);
        System.out.println("0. untuk Kembali ke menu");
        System.out.println("1. Melihat Kelas di sekolah tersebut");
        System.out.println("2. Melihat Siswa di sekolah tersebut");
        int pilihan = inpt.nextInt();
        if(pilihan == 0 ) return; // :)

        if(pilihan == 1) KelasDiSekolah(inpo.N);
    }

    static void InfoKelas(String nama){
        Kelas[] k = kelas.getArrayList().toArray(new Kelas[0]);
        int i = 0;
        int index;
        for(Kelas inpo : k) {
            if (inpo.Nama.equals(nama)) {
                System.out.println("=======INFO KELAS=======");
                System.out.println(inpo.Nama);
                System.out.println("Sekolah      : " + inpo.skull.N);
                System.out.println("Jumlah Siswa : " + siswa.searchSiswaByKelas(inpo.Nama).length);
                index = i;
            }
            i++;
        }
        System.out.println("0. Kembali ke Menu");
        System.out.println("1. List Siswa");
        int pemilihan = inpt.nextInt();
        if(pemilihan == 0){
            System.out.println();
        }
        if(pemilihan == 1){
            listSiswa();
        }
        else {
            InfoKelas(nama);
        }
    }

    static void InfoSiswa(utils.Siswa inpo){
        System.out.println("=======INFO SISWA=======");
        System.out.println("Nama    : " + inpo.N);
        System.out.println("Sekolah : " + inpo.k.skull.N);
        System.out.println("Kelas   : " + inpo.k.Nama);
    }

    static void Testing(){
        sekolah.addsekolah(new
                utils.Sekolah("SMK TELKOM MALANG", utils.Sekolah.Jenjang.SMK));
        sekolah.addsekolah(new
                utils.Sekolah("MTsN 3 Malang", Sekolah.Jenjang.MTs));
        sekolah.addsekolah(new
                utils.Sekolah("SD UMMU AIMAN", utils.Sekolah.Jenjang.SD));
        kelas.addKelas(new Kelas("10 RPL 6", sekolah.getsekolah()[0]));
        String[] LiskKelas = kelas.searchKelasBySekolah("SMK TELKOM MALANG");
        for (String list : LiskKelas){
            System.out.println(list);
        }
    }

    static void pemilihan1(){
        listSekolah();
        Sekolah[] TempData = sekolah.getsekolah();
        System.out.println("0. Untuk Kembali");
        System.out.println(TempData.length + 1 + ". Untuk Menambah data");
        System.out.println("\nPilih Nomer Sekolah untuk melihat info Sekolah");
        int pilihan = inpt.nextInt();
        System.out.println();
        if(pilihan > 0 && pilihan <= TempData.length){
            --pilihan;
            InfoSekolah(TempData[pilihan]);
        }
        if(pilihan == 0){
            //yaudah sih
            System.out.println();
        }
        if (pilihan == (TempData.length + 1)){
            inpt.nextLine();
            System.out.println("Input Nama: ");
            String nama = inpt.nextLine();
            System.out.println("List Jenjang");
            System.out.println(java.util.Arrays.asList(Sekolah.Jenjang.values()));
            System.out.println("Input jenjang: ");

            // i know bakalan error kalo typo (lagi mager ngoding + lagi masa masa kesalahan berfikir :<)
            try {
                sekolah.addsekolah(new Sekolah(nama, Sekolah.Jenjang.valueOf(inpt.next().toUpperCase())));
                System.out.println("Data Sudah ditambah");
                System.out.println();
                pemilihan1();
            }catch (Exception e){
                System.out.println("yah error kena typo: \n" + e);
            }
        }
        else {
            // ketika ngoding tapi malas
            System.out.println("Pilihan Gak ada");
            pemilihan1();
        }
    }
}