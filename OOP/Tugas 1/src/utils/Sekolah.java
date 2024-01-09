package utils;

public class Sekolah {
    public String N;
    public enum Jenjang{
        TK,
        SD,SDK,
        SMP,SMPK,MTs,
        MA,SMA,SMK,SMKK
    }

    public Sekolah(String Nama,Jenjang jenjang){
        N = Nama;
        Jenjang = jenjang;
    }
}
