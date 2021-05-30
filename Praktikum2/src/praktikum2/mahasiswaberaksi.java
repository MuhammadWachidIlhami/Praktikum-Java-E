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
public class mahasiswaberaksi {
     public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formarTanggal = new SimpleDateFormat(pattern: "dd-MM-yyyy");
        
        
        mhs.npm = "19631170";
        mhs.nama = "Muhammad Wachid Ilhami";
        mhs.tanggalLahir= formatTanggal.parse(source: "17-01-2021");
        
        System.out.println(mhs.npm);
        System.out.println(mhs.nama);
        System.out.println(mhs.tanggalLahir "+ formatTanggal.format(mhs.tanggalLahir"));
        
        System.out.println("=======================================");
        
        Mahasiswa mhs2 = new Mahasiswa();
        
          
        mhs2.npm = "19631987";
        mhs2.nama = "Raihan";
        mhs2.tanggalLahir= formatTanggal.parse(source: "17-01-2021");
        
        
        System.out.println(npm = "mhs2.npm);
        System.out.println(nama = "mhs2.nama);
        System.out.println(tanggalLahir= "+mhs2.tanggallahir "+ formatTanggal.format(mhs.tanggalLahir"));
        
         System.out.println("=======================================");
         System.out.println("Ini yang menggunkan Method");
         System.out.println("=======================================");
   
         mhs.tampilkanIdentitasDiri();
         mhs2.tampilkanIdentitasDiri();
    
}
}
