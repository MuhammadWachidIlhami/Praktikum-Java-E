/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.uniska.model;

/**
 *
 * @author USER
 */
public class MataKuliah {
    
    int idMakul;
    String namaMakul, singkatanMakul, namaDosen, kontakDosen;
    boolean aktif;
    
    public MataKuliah(int idMakul, String namaMakul, String singkatanMakul, String namaDosen, String kontakDosen, boolean aktif) {
        this.idMakul = idMakul;
        this.namaMakul = namaMakul;
        this.singkatanMakul = singkatanMakul;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }
    
    public MataKuliah(int aInt, int aInt0, String string, String string0, String string1, int aInt1, int aInt2) {
    
    }
    
    public int getIdMakul() {
        return idMakul;
    }

    public void setIdMakul(int idMakul) {
        this.idMakul = idMakul;
    }

    public String getNamaMakul() {
        return namaMakul;
    }

    public void setNamaMakul(String namaMakul) {
        this.namaMakul = namaMakul;
    }

    public String getSingkatanMakul() {
        return singkatanMakul;
    }

    public void setSingkatanMakul(String singkatanMakul) {
        this.singkatanMakul = singkatanMakul;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}

