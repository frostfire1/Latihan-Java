package utils;

import init.Kelas;

import java.io.Serializable;
import java.util.Arrays;

public class Sekolah implements Serializable {
    private static final long serialVersionUID = 1L;
    private final Sekolah.Jenjang J;
    public String N;
    public enum Jenjang{
        TK,
        SD,SDK,
        SMP,SMPK,MTs,
        MA,SMA,SMK,SMKK
    }

    public Sekolah(String Nama,Jenjang jenjang){
        N = Nama;
        J = jenjang;
    }

}