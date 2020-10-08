package com.pboreg;

public class main {

    public static void main(String[] args) {

        // Operasi Aritmatika
        int nilai1 = 8;
        int nilai2 = 2;
        int hasil;

        // 1. Penjumlahan
        hasil = nilai1 + nilai2;
        System.out.printf("%d + %d = %d \n", nilai1, nilai2, hasil);

        // 2. Pengurangan
        hasil = nilai1 - nilai2;
        System.out.printf("%d - %d = %d \n", nilai1, nilai2, hasil);

        // 3. Perkalian
        hasil = nilai1 * nilai2;
        System.out.printf("%d x %d = %d \n", nilai1, nilai2, hasil);

        // 4. Pembagian
        hasil = nilai1 / nilai2;
        System.out.printf("%d / %d = %d \n", nilai1, nilai2, hasil);
        // Pembagian menggunakan float
        float a = 8;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat );

        // 5. Modulus (Sisa Pembagian)
        hasil = nilai1 % nilai2;
        System.out.printf("%d %% %d = %d \n", nilai1, nilai2, hasil);

    }
}
