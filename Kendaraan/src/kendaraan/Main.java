/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Marvian
 */
public class Main {
public static void main(String[]args){
    Kendaraan kendaraan1 = new Kendaraan();
    kendaraan1.bergerak();
    kendaraan1.bergerak("2 mata");
    
    
    Mobil avanza = new Mobil();
    avanza.bergerak();
    avanza.bergerak("dua tangan");
    avanza.berjalanMundur();
    
    Pesawat AirAsia = new Pesawat();
    AirAsia.bergerak();
    AirAsia.bergerak("menggunakan kaki");
    AirAsia.terbang();
    }
}
