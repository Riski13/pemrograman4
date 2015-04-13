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
public class BangunDatar {
    private int sisi;
    private int a,b,c;
    float keliling;
    float luas;
    String namaL;
    
public BangunDatar(){
}

public BangunDatar(String Nama){
    System.out.print(Nama);
}

public void setNama(String eNama){
    namaL = eNama;
}

public String getNama(){
    System.out.print(namaL);
   return namaL;
}



public void KelPersegi(float sisi){
    sisi = 4 * sisi;
    System.out.println(sisi);
    }
public void LPersegi(float sisi){
    sisi *= sisi;
    System.out.println(sisi);
}
public void KelSegitiga(float kel, float a, float b, float c){
    keliling = a + b + c;
    System.out.println(keliling);
}
public void Lseg(float a, float tinggi , float luas){
    luas = (a * tinggi ) / 2;
    System.out.println(luas);
}

public void Ppanjang(float a, float b, float LPpanjang){ //Luas
    LPpanjang = a * b;
    System.out.println(LPpanjang);
}
public void Ppanjang(int a, int b, float Kel){  //Kel
    Kel = 2 * (a + b); 
    System.out.println(Kel);
}

//public void Kelppanjang(float a, float b, float kel){
////    kel = 2* (a+b);
//    System.out.println(kel);
//  
}
