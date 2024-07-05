/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan karyawan
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        // Menambahkan beberapa karyawan ke dalam ArrayList
        KaryawanBank karyawan1 = new KaryawanBank("Ramadhan", "Teller", 5000000);
        Karyawan karyawan2 = new Karyawan("Kamarudin", "Customer Service");

        daftarKaryawan.add(karyawan1);
        daftarKaryawan.add(karyawan2);

        // Memanggil metode untuk absen
        karyawan1.absenTanggal("2024-07-01");
        karyawan1.absenTanggal("2024-07-02");

        karyawan2.absenTanggal("2024-07-01");

        // Menampilkan daftar absensi setiap karyawan
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println("Absensi " + karyawan.getNama() + ": " + karyawan.getAbsensi());
        }

        // Contoh input/output sederhana untuk menambahkan absen
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan nama karyawan untuk absen (Ramadan atau Kamarudin): ");
            String namaKaryawan = scanner.nextLine();
            System.out.print("Masukkan tanggal absen baru (YYYY-MM-DD): ");
            String tanggalAbsenBaru = scanner.nextLine();

            // Cari karyawan dengan nama yang sesuai
            Karyawan karyawanYangDiabsen = null;
            for (Karyawan karyawan : daftarKaryawan) {
                if (karyawan.getNama().equals(namaKaryawan)) {
                    karyawanYangDiabsen = karyawan;
                    break;
                }
            }

            if (karyawanYangDiabsen != null) {
                karyawanYangDiabsen.absenTanggal(tanggalAbsenBaru);
                System.out.println("Absen berhasil ditambahkan untuk " + namaKaryawan + "!");
            } else {
                System.out.println("Karyawan dengan nama tersebut tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

    

