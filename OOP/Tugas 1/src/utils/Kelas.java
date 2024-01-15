package utils;

import java.io.Serializable;

public class Kelas implements Serializable {
    private static final long serialVersionUID = 1L;

    public String Nama;
    public Sekolah skull;

    public Kelas(String Kelas, Sekolah sekolah) {
        Nama = Kelas;
        skull = sekolah;
    }
}
