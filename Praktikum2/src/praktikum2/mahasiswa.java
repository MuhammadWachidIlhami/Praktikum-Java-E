/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.text.PerseException;
import java.text.SimpleDataFormat;
import java.util.Date;


/**
 *
 * @author USER
 */
public class mahasiswa {
    String npm, nama;
    Date tanggalLahir;
    
    void tampilkanIdentitasDiri() //Procedure
    {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern "dd-MM-yyyy)");
        System.out.println('NPM +" this.npm);
        System.out.println(Nama lengkap "+ thisn.npm);
        System.out.println(Tanggal lahir "+ sdf.format(this.tanggallahir));"
    } 
        int hitungUsia() //function
        {
            Calendar tglLahir = Calendar.getInstance();
            tglLahir.setTime(this.tanggalLahir);
            Calendar hariini = Calendar.getInstance();
            
            int selisih =hariIni.get(Calendar.YEAR - tanggaLahir.get(Calendar.YEAR);
            if(hariIni.get(Calendar.MONTH) < tanggalLahir.Get(Calendar.MONTH)){
            selisih--;
            }else{
                if(hariIni.Get(Calendar.MONTH)) == tanggalLahir.get(Calendar.MONTH) && hariIni.get(Calendar.DAY_OF_MONTH) < tanggalLahir.get(Calendar.DAY_OF_MONTH)) {
                        }
        }
         return selisih;
  }
        
  double hitungkali(double nilai1, double nilai2)
  {
      return nilai1 * nilai2;
  }
 void SapaNama(String nama)
 {
     JOptionPane.showMassageDialog(
             parentComponent: null, message: "Hai "+nama, title: "Ini Judul", JOptonePane.WARNING_MESSAGE);
    
}
