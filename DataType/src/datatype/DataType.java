package datatype;

import javax.swing.*;

public class DataType {

    
    public static void main(String[] args) {
        //static datatype

    String namaDepan    = "Muhammad";
    String namaTengah   = "Wachid";
    String namaBelakang = "Ilhami";
    int usia            = 20;
    int targetTahunKuliah = 4;
    double ipk            = 3.8;
    char nilaiAbjad       = 'A';
    boolean tampan        = true;

        System.out.println("Nama Depan :" + namaDepan);
        System.out.println("Nama Tengah :" + namaTengah);
        System.out.println("Nama Belakang :" + namaBelakang);
        System.out.println("Usia :" + usia);
        System.out.println("Target Kuliah :" + targetTahunKuliah+ " tahun");
        System.out.println("IPK : "+ ipk);
        System.out.println("Nilai PBD :" + nilaiAbjad);
        System.out.println("Tampan "+ tampan);

        JOptionPane.showMessageDialog(null, "Halo "+namaDepan+" "+namaTengah+" "+namaBelakang, "ini judul", JOptionPane.INFORMATION_MESSAGE);


    }
    
}
