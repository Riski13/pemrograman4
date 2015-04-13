/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author Marvian
 */
public class NewClass {

    public static void main(String[]args){
        Hewan binatang = new Hewan();
        binatang.berjalan();
        binatang.makan();
        
        Kucing kucing1 = new Kucing();
        kucing1.berjalan();
        kucing1.makan();
        kucing1.bermain();
        
        Ikan lele = new Ikan();
        lele.makan();
        lele.berenang();
        lele.berjalan();
    }
}

