package utils;


import java.io.*;
import java.util.ArrayList;

public class File {
    public static void saveSekolah(ArrayList<Sekolah> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Sekolah.joe"))) {
            oos.writeObject(data);
            System.out.println("Data berhasil disimpan di Sekolah.joe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  ArrayList<Sekolah> loadSekolah() {
        ArrayList<Sekolah> readData = new ArrayList<Sekolah>();;
        java.io.File file = new java.io.File("Sekolah.joe");
        if(file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Sekolah.joe"))) {
                readData = (ArrayList<Sekolah>) ois.readObject();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("File Tidak Ada");
        }
        return readData;
    }

    public static void saveKelas(ArrayList<Kelas> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Kelas.joe"))) {
            oos.writeObject(data);
            System.out.println("Data berhasil disimpan");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  ArrayList<Kelas> loadKelas() {
        ArrayList<Kelas> readData = new ArrayList<Kelas>();;
        java.io.File file = new java.io.File("Kelas.joe");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Kelas.joe"))) {
                readData = (ArrayList<Kelas>) ois.readObject();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("File Tidak ada");

        }
        return readData;
    }

    public static void saveSiswa(ArrayList<Siswa> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Siswa.joe"))) {
            oos.writeObject(data);
            System.out.println("Data berhasil disimpan");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  ArrayList<Siswa> loadSiswa() {
        ArrayList<Siswa> readData = new ArrayList<Siswa>();;
        java.io.File file = new java.io.File("Siswa.joe");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Siswa.joe"))) {
                readData = (ArrayList<Siswa>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("File Tidak ada");

        }
        return readData;
    }
}
