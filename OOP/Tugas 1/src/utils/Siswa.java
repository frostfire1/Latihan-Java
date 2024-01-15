package utils;

import java.io.Serializable;

public class Siswa implements Serializable {
    private static final long serialVersionUID = 1L;
    public String N;
    public Kelas k;
    public Siswa(String Nama, Kelas Kelas){
        N = Nama;
        k = Kelas;

    }
}
