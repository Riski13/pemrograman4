/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riski
 */
public class Pegawai {
   String nama;
   int umur;
   String alamat;
   double gaji;
   
public Pegawai(){    
}

public void setNama(String NamaNew){
    nama = NamaNew;
}
public String getNama(){
    System.out.println("Nama : " + nama);
    return nama;
}
public void setUmur(int NewUmur){
    umur = NewUmur;
}
public int getUmur(){
    System.out.println("Umur : " + umur);
    return umur;
}
public void setAlamat(String NAlamat){
    alamat = NAlamat;
}
public String getAlamat(){
    System.out.println("Alamat : " + alamat);
    return alamat;
}
public void setGaji(double Gajih){
    gaji = Gajih;
}
public double getGajih(){
    System.out.println("Gaji : " + gaji);
    return gaji;
}
public void CetakInfo(){
    System.out.println("Data Pegawai");
}

public static void main(String[] args){
    Pegawai Info = new Pegawai();
    Info.setNama("harun");
    Info.getNama();
    Info.setUmur(34);
    Info.getUmur();
    Info.setAlamat("Jalan Cikutra no.36");
    Info.getAlamat();
    Info.setGaji(2000000);
    Info.getGajih();
    Info.CetakInfo();
    }
}
