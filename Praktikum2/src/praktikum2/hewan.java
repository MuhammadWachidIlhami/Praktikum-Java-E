/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author USER
 */
public class hewan {
    String nama, jenis;
    Integer JumlahKaki;
    Date tanggalLahir;
    
    Public Hewan(String nama, String jenis, String JumlahKaki, Date tanggalLahir); throws ParseException {
    
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat( pattern: "dd-MM-yyyy");
    this.nama = nama;
    this.jenis = jenis;
    this.jumlahkaki = jumlahKaki;
    this.tanggalLahir = simpleDateFormat.parse(tanggalLahir());
    System.out.println(nama+" "+jenis + " " + jumlahkaki);
    
}
