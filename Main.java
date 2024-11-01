package org.example;

import java.util.Scanner;

public class Main {

    /**
     * Method utama (main) program yang menginisialisasi input dari pengguna dan memanggil
     * method untuk menghitung serta menampilkan hasil luas dan keliling persegi panjang.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil input panjang dan lebar
        double panjang = PersegiPanjangA.ambilInput(input, "Masukkan panjang persegi panjang: ");
        double lebar = PersegiPanjangA.ambilInput(input, "Masukkan lebar persegi panjang: ");

        // Menghitung dan menampilkan hasil
        PersegiPanjangA.tampilkanHasil(panjang, lebar);

        input.close();
    }
}
