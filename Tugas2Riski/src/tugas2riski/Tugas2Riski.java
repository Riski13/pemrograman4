/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2riski;

/**
 *
 * @author Riski
 */
public class Tugas2Riski {
 
    private int sisi = 10;
    private int a;//panjang
    private int b;//lebar
    private int c;//tinggi
    float keliling;
    float luas;
    String NamaBD;
    
public Tugas2Riski(){
}

public Tugas2Riski(String Nama){
    System.out.print(Nama);
}

public void setNama(String NamaBangunD ){
    NamaBD = NamaBangunD;
}

public String GetNamaBd(){
    System.out.print(NamaBD);
    return NamaBD;
}

public void BangunDatar(){
    System.out.print(" = ");
}

public void Persegi(float sisi){
    sisi = 4 * sisi;
    System.out.println(sisi);
    }
public void Persegi(){
    sisi *= sisi;
    System.out.println(sisi);
}
public void Segitiga(int a, int b, int c){
    keliling = a + b + c; //sisi-sisi segitiga
    System.out.println(keliling);
}
public void Segitiga(int a, int c){
    luas = (a * c ) / 2; //a (alas)
    System.out.println(luas);
}

public void Ppanjang(int a, int b, float luas){
    luas = a * b;
    System.out.println(luas);
}

public void Ppanjang(int a, int b){
    keliling = 2* (a+b);
    System.out.println(keliling);
    }
}
