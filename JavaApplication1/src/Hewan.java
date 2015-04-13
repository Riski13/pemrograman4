/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riski
 */
public class Hewan {
   int umur;
   int jumlahKaki;
   
   public Hewan(){
}

public void setjumlahKaki(int jumlahKakiHewan){
    jumlahKaki = jumlahKakiHewan;
}

public int getJumlahKaki(){
    System.out.println("jumlah Kaki hewan" + jumlahKaki);
    return jumlahKaki;
}

public void setUmur(int umurHewan){
    umur = umurHewan;
}

public int getUmur(){
    System.out.println("Umur Hewan " + umur);
    return umur;
}
public void berjalan(){
    System.out.println("Hewan Berjalan");
}
public void berbunyi(){
    System.out.println("Hewan Berbunyi");
}

public static void main (String[] args){
    Hewan Kucing = new Hewan();
    Kucing.setUmur(7);
    Kucing.getUmur();
    Kucing.berbunyi();
    Kucing.berjalan();
    }
}

