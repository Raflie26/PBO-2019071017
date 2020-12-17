package com.pboreg;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.omg.CORBA.SetOverrideType;

import javax.xml.soap.SOAPPart;

public class PesanController {
    public TextField textPesan;
    public Label labelPesan;
    private koneksi koneksi = new koneksi();
    public void buttonPesanOnClick(ActionEvent actionEvent) {
        String teks = textPesan.getText();
        labelPesan.setText(teks);

        //Input data ketabel pesan pada database pbo-reg
        String query = "INSERT INTO pesan(isipesan) VALUES('" + teks + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput kedalam tabel");
        }
    }
}
