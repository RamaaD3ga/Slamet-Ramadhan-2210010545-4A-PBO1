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
// Turunan dari kelas Karyawan: KaryawanBank
public class KaryawanBank extends Karyawan {
    private double gaji;

    // Constructor
    public KaryawanBank(String nama, String jabatan, double gaji) {
        super(nama, jabatan);
        this.gaji = gaji;
    }

    // Polymorphism: Overriding metode absenTanggal dari kelas induk
    @Override
    public void absenTanggal(String tanggal) {
        System.out.println("Karyawan Bank " + getNama() + " absen pada tanggal " + tanggal);
        super.absenTanggal(tanggal);
    }
}

