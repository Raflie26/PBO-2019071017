package com.pboreg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class koneksi {
    //Buat attribut koneksi
    private Connection coonn;

    //Buat deklarasi attribut untuk statement
    private Statement st;

    //definisikan username , password , dan alamat dari server mysql
    public koneksi () {
        try{
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/pbo-reg";
            coonn = DriverManager.getConnection(url,password,user);
        }catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //Untuk Input Data (Insert), Edit Data (Update), dan Hapus Data (Delete
    public int manipulasiData(String query) {
       try {
           st = coonn.createStatement();
            return st.executeUpdate(query);
       }catch (SQLException e) {
           System.out.println("Error: " + e.getMessage());
            return 0;
       }
    }
}

