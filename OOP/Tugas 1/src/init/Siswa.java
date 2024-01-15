package init;

import utils.File;

import java.io.Serializable;
import java.util.ArrayList;

public class Siswa implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<utils.Siswa> arrayList = new ArrayList<>();

    public void addSiswa(utils.Siswa siswa) {
        arrayList.add(siswa);
        File.saveSiswa(this.arrayList);
    }

    public ArrayList<utils.Siswa> getArrayList() {
        return arrayList;
    }

    public void setSiswa(ArrayList<utils.Siswa> arrayList) {
        this.arrayList = arrayList;
    }

    public String[] searchSiswaByKelas(String Kelas) {
        ArrayList<String> resultArray = new ArrayList<>();
        for (utils.Siswa siswa : arrayList) {
            if (siswa.k != null && siswa.k.Nama.equals(Kelas)) {
                resultArray.add(siswa.N);
            }
        }
        return resultArray.toArray(new String[0]);
    }

    public String[] searchSiswaBySekolah(String Sekolah) {
        ArrayList<String> resultArray = new ArrayList<>();
        for (utils.Siswa siswa : arrayList) {
            if (siswa.k.skull.N != null && siswa.k.skull.N.equals(Sekolah)) {
                resultArray.add(siswa.N);
            }
        }
        return resultArray.toArray(new String[0]);
    }
}
