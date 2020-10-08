package com.pboreg;

public class main {

    public static void main(String[] args) {

        // Operator komparasi akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // Operator Equal atau Persamaan
        System.out.println("-----Persamaan-----");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d == %d --> %s \n", a,b,hasilKomparasi);

        // Operator Not Equal atau Pertidaksamaan
        System.out.println("---Pertidaksamaan---");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a,b,hasilKomparasi);

        // Operator Less than atau Kurang Dari
        System.out.println("---Kurang Dari---");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a,b,hasilKomparasi);

        // Operator Greater than atau Kurang Dari
        System.out.println("---Lebih Dari---");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a,b,hasilKomparasi);

        // Operator Less than equal atau Kurang Dari sama dengan
        System.out.println("---Kurang Dari Sama Dengan---");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b,hasilKomparasi);

        // Operator Greater than equal atau Kurang Dari Sama Dengan
        System.out.println("---Lebih Dari Sama Dengan---");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b,hasilKomparasi);

    }
}
