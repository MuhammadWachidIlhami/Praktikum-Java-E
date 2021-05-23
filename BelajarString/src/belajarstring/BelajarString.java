package belajarstring;

import java.util.Locale;

public class BelajarString {

    public static void main(String[] args) {
       char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        //###############################################################################

        String namaDepan        = "Muhammad";
        String namaTengah       = "Wachid";
        String namaBelakang     = "Ilhami";

        String namaLengkap = namaDepan + " "+ namaTengah+ " "+ namaBelakang;

        System.out.println(namaLengkap.length()); //mengetahui panjang karakter
        System.out.println(namaBelakang.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5)); // menghilangkan karakter dari depan sebanyak n
        System.out.println (namaLengkap.substring(5, 12))); // menghilangkan karakter dari depan dan belakang sebanyak n
        System.out.println(namaLengkap.replace("Rasyid"); // mereplace target dengan string yang di
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());

       
    }
    
}
