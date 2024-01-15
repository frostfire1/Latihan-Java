package init;
import utils.File;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Sekolah implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<utils.Sekolah> arrayList = new ArrayList<>();

    public ArrayList<utils.Sekolah> getsekolahArrayList() {
        return arrayList;
    }

    public void addsekolah(utils.Sekolah sekolah) {
        arrayList.add(sekolah);
        File.saveSekolah(this.arrayList);
    }

    public utils.Sekolah[] getsekolah() {
        return arrayList.toArray(new utils.Sekolah[0]);
    }

    public void setSekolah(ArrayList<utils.Sekolah> list_sekolah) {
        this.arrayList = list_sekolah;
    }

}
