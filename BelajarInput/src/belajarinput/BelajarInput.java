package belajarinput;

import javax.swing.*;
import java.util.Scanner;

class BelajarInput {

    public static void main(String[] args) {
         string namaLengkap; // null

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama Lengkap Anda : ");
        namaLengkap = input.nextLine(); // string

        JOptionPane.showMessageDialog(null, "Halo "+namaLengkap, "Informasi", JOptionPane.INFORMATION);
       
    }
    
}
