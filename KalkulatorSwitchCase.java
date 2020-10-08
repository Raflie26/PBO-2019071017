package com.pboreg;

import java.util.*;

public class main{

    public static void main(String[] args) {

        // membuat program kalkulator menggunakan switch case
        Scanner inputUser;
        float a, b, hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch (operator) {
            case "+":
                //PENJUMLAHAN
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                //PENGURANGAN
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                //PERKALIAN
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                //PEMBAGIAN
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                break;
            default:
                System.out.println("operator " + operator + " tidak ditemukan");

        }

    }
}
