import utils.File;
import utils.Kelas;
import utils.Sekolah;
import utils.Siswa;

import java.util.Scanner;
import java.sql.SQLOutput;


public class Main {
    static init.Sekolah sekolah = new init.Sekolah();
    static init.Kelas kelas = new init.Kelas();
    static init.Siswa siswa = new init.Siswa();
    static Scanner inpt = new Scanner(System.in);
    static String sklh;
    static String kls;

    public static void main(String[] args) {
        //Load File
        sekolah.setSekolah(File.loadSekolah());
        kelas.setKelas(File.loadKelas());
        siswa.setSiswa(File.loadSiswa());
        //Testing();
        int pilihan1;
        int pilihan2 = 0;
        //Loop Program
        while(true) {
            System.out.println("Basic simple program Database Sekolah");
            System.out.println("0. Tutup Program");
            System.out.println("1. List Sekolah");
            System.out.println("2. list semua Kelas di Database");
            System.out.println("3. list Semua Siswa di Database");
            pilihan1 = inpt.nextInt();
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
        for (String list : LiskKelas){
            System.out.println(list);
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

    }

    static void InfoKelas(utils.Kelas inpo){

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
}