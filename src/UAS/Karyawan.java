/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;

// Definisi kelas Karyawan
public class Karyawan {
    private String nama;
    private String jabatan;
    private ArrayList<String> absen; // Atribut untuk menyimpan absensi, berupa list tanggal

    // Constructor
    public Karyawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.absen = new ArrayList<>();
    }

    // Mutator untuk menambahkan absen baru
    public void absenTanggal(String tanggal) {
        absen.add(tanggal);
    }

    // Accessor untuk mendapatkan absensi
    public ArrayList<String> getAbsensi() {
        return absen;
    }

    // Accessor untuk mendapatkan nama karyawan
    public String getNama() {
        return nama;
    }

    // Accessor untuk mendapatkan jabatan karyawan
    public String getJabatan() {
        return jabatan;
    }
}

