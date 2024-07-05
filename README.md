
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data karyawan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan jabatan karyawan, serta memberikan output berupa informasi absensi karyawan tersebut.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karyawan`, `KaryawanBank`, dan `Main` adalah contoh dari class.

```java
public class Karyawan {
    ...
}

public class KaryawanBank extends Karyawan {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `karyawan1` dan `karyawan2` adalah contoh pembuatan object.

```java
KaryawanBank karyawan1 = new KaryawanBank("Ramadhan", "Teller", 5000000);
Karyawan karyawan2 = new Karyawan("Kamarudin", "Customer Service");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `jabatan`, dan `absen` adalah contoh atribut.

```java
private String nama;
private String jabatan;
private ArrayList<String> absen;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Karyawan` dan `KaryawanBank`.

```java
public Karyawan(String nama, String jabatan) {
    this.nama = nama;
    this.jabatan = jabatan;
    this.absen = new ArrayList<>();
}

public KaryawanBank(String nama, String jabatan, double gaji) {
    super(nama, jabatan);
    this.gaji = gaji;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `absenTanggal` adalah contoh method mutator.

```java
public void absenTanggal(String tanggal) {
    absen.add(tanggal);
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJabatan`, dan `getAbsensi` adalah contoh method accessor.

```java
public String getNama() {
    return nama;
}

public String getJabatan() {
    return jabatan;
}

public ArrayList<String> getAbsensi() {
    return absen;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `jabatan`, dan `absen` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
private String nama;
private String jabatan;
private ArrayList<String> absen;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KaryawanBank` mewarisi `Karyawan` dengan sintaks `extends`.

```java
public class KaryawanBank extends Karyawan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Pada kode ini, method `absenTanggal` di `KaryawanBank` merupakan override dari method `absenTanggal` di `Karyawan`.

```java
@Override
public void absenTanggal(String tanggal) {
    System.out.println("Karyawan Bank " + getNama() + " absen pada tanggal " + tanggal);
    super.absenTanggal(tanggal);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam metode pencarian karyawan berdasarkan nama.

```java
if (karyawan.getNama().equals(namaKaryawan)) {
    karyawanYangDiabsen = karyawan;
    break;
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan data absensi karyawan.

```java
for (Karyawan karyawan : daftarKaryawan) {
    System.out.println("Absensi " + karyawan.getNama() + ": " + karyawan.getAbsensi());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama karyawan untuk absen (Ramadan atau Kamarudin): ");
String namaKaryawan = scanner.nextLine();

System.out.println("Absensi " + karyawan.getNama() + ": " + karyawan.getAbsensi());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ArrayList<Karyawan>` adalah contoh penggunaan array.

```java
ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```java
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    scanner.close();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Slamet Ramadhan  
NPM: 2210010545
