/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riski
 */
public class Obat {
    int id_obat;
    String NamaObat;
    String Kadaluarsa;

public Obat(){
}

public void setid_obat(int id_obatnew){
    id_obat = id_obatnew;
}
public int getidobat(){
    System.out.println("No id Obat " + id_obat);
    return id_obat;
}

public void setNamaObat(String NamaObatnew){
    NamaObat = NamaObatnew;
}

public String getNamaObat(){
    System.out.println("Nama Obat " + NamaObat);
    return NamaObat;
}

public void setKadaluarsa(String KadaluarsaNew){
    Kadaluarsa = KadaluarsaNew;
}

public String getKadaluarsa(){
    System.out.println("Tanggal Kadaluarsa : " + Kadaluarsa);
    return Kadaluarsa;
}

public void ObatAmis(){
    System.out.println("Obat rasa Manis Untuk Anak");
}
public void Mahal(){
    System.out.println("Obat mahal ");
}

public static void main(String[] args){
    Obat Pilek = new Obat();
    Pilek.setid_obat(1234);
    Pilek.getidobat();
    Pilek.setNamaObat("Fix Formula 44");
    Pilek.getNamaObat();
    Pilek.setKadaluarsa("21-03-2014");
    Pilek.getKadaluarsa();
    }
}
