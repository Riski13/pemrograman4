/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Riski
 */
public class Hitung {
    public static void main(String[] args){
        BangunDatar Luas = new BangunDatar("Luas Persesgi = ");
//        Luas.Hitung();
        Luas.LPersegi(10);
        
        BangunDatar Kel = new BangunDatar("Keliling Persegi = ");
//        Kel.Hitung();
        Kel.KelPersegi(10);
        
        BangunDatar Lppanjang = new BangunDatar();
        Lppanjang.setNama("Luas Persegi Panjang = ");
        Lppanjang.getNama();
        Lppanjang.Ppanjang(4,5,0);
        
        BangunDatar Kelppanjang = new BangunDatar("Keliling Persegi Panjang = ");
        Kelppanjang.Ppanjang(8,4,0);
        
        BangunDatar Lseg = new BangunDatar("Luas Segitiga = ");
        Lseg.Lseg(2,25,0);
        
        BangunDatar KelSeg = new BangunDatar("Keliling Segitiga = ");
//        KelSeg.Hitung();
        KelSeg.KelSegitiga(0,10,10,10);
        
       
    }
}
