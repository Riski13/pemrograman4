/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2riski;

/**
 * 
 *
 * @author Riski
 */
public class Menghitung {
     public static void main(String[] args){
 
        Tugas2Riski Luas = new Tugas2Riski();
        Luas.setNama("Luas Persegi ");
        Luas.GetNamaBd();
        Luas.BangunDatar();
        Luas.Persegi();
       
        Tugas2Riski Kel = new Tugas2Riski();
        Kel.setNama("Keliling Persegi ");
        Kel.GetNamaBd();
        Kel.BangunDatar();
        Kel.Persegi(10);
        
        Tugas2Riski Lppanjang = new Tugas2Riski();
        Lppanjang.setNama("Luas persegi panjang ");
        Lppanjang.GetNamaBd();
        Lppanjang.BangunDatar();
        Lppanjang.Ppanjang(10, 2,0);
        
        Tugas2Riski Kelppanjang = new Tugas2Riski();
        Kelppanjang.setNama("Keliling Persegi Panjang ");
        Kelppanjang.GetNamaBd();
        Kelppanjang.BangunDatar();
        Kelppanjang.Ppanjang(10,2);
        
        Tugas2Riski Lseg = new Tugas2Riski();
        Lseg.setNama("Luas Segitiga ");
        Lseg.GetNamaBd();
        Lseg.BangunDatar();
        Lseg.Segitiga(10, 5);
        
        Tugas2Riski KelSeg = new Tugas2Riski();
        KelSeg.setNama("Keliling Segitiga ");
        KelSeg.GetNamaBd();
        KelSeg.BangunDatar();
        KelSeg.Segitiga(10, 2, 5);
    }
}
