package org.example;

import java.util.Scanner;

/**
 * Kelas PersegiPanjangA menyediakan metode untuk menghitung luas dan keliling persegi panjang.
 * Kelas ini berinteraksi dengan pengguna untuk menerima input panjang dan lebar.
 * Kemudian menampilkan hasil perhitungan luas dan keliling.
 */

public class PersegiPanjangA {

    /**
     * Mengambil input input dari pengguna berupa panjang atau lebar persegi panjang.
     *
     * @param input Scanner untuk membaca input dari pengguna.
     * @param pesan Teks yang akan ditampilkan sebagai prompt kepada pengguna.
     * @return Nilai panjang atau lebar yang dimasukkan pengguna.
     */

    public static double ambilInput(Scanner input, String pesan) {      // Refactoring 1: Membuat metode untuk mengambil input dari pengguna
        System.out.print(pesan);
        return input.nextDouble();
    }

    /**
     * Menghitung luas persegi panjang berdasarkan panjang dan lebar yang diberikan.
     *
     * @param panjang Panjang dari persegi panjang.
     * @param lebar Lebar dari persegi panjang.
     * @return Luas persegi panjang.
     */

    public static double hitungLuas(double panjang, double lebar) {     // Refactoring 2: Membuat metode untuk menghitung luas
        return panjang * lebar;
    }

    /**
     * Menghitung keliling persegi panjang berdasarkan panjang dan lebar yang diberikan.
     *
     * @param panjang Panjang dari persegi panjang.
     * @param lebar Lebar dari persegi panjang.
     * @return Keliling persegi panjang.
     */

    public static double hitungKeliling(double panjang, double lebar) {     // Refactoring 3: Membuat metode untuk menghitung keliling
        return 2 * (panjang + lebar);
    }

    /**
     * Menampilkan hasil perhitungan luas dan keliling persegi panjang.
     * Metode ini menggunakan metode `hitungLuas` dan `hitungKeliling` untuk menghitung
     * nilai yang akan ditampilkan ke layar.
     *
     * @param panjang Panjang dari persegi panjang.
     * @param lebar   Lebar dari persegi panjang.
     */

    public static void tampilkanHasil(double panjang, double lebar) {       // Refactoring 4 & 5: Membuat metode untuk menampilkan hasil
        double luas = hitungLuas(panjang, lebar);
        double keliling = hitungKeliling(panjang, lebar);

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}