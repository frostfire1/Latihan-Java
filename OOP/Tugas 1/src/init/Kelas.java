package init;


import utils.File;

import java.io.Serializable;
import java.util.ArrayList;


public class Kelas implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<utils.Kelas> arrayList = new ArrayList<>();

    public void addKelas(utils.Kelas kelas) {
        arrayList.add(kelas);
        File.saveKelas(this.arrayList);
    }

    public void setKelas(ArrayList<utils.Kelas> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<utils.Kelas> getArrayList() {
        return arrayList;
    }

    public String[] getSemuaKelas() {
        ArrayList<String> resultArray = new ArrayList<>();
        for (utils.Kelas kelas : arrayList) {
            resultArray.add(kelas.Nama);
        }
        return resultArray.toArray(new String[0]);
    }

    public String[] searchKelasBySekolah(String sekolah) {
        ArrayList<String> resultArray = new ArrayList<>();
        for (utils.Kelas kelas : arrayList) {
            if (kelas.skull != null && kelas.skull.N.equals(sekolah)) {
                resultArray.add(kelas.Nama);
            }
        }
        return resultArray.toArray(new String[0]);
    }
}
