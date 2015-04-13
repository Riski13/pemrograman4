/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Riski
 */
public class Tes {
     public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa Baru = new Mahasiswa("Riski");
        Baru.ongkos();
        Baru.ongkos(1000);
        Baru.umur(30);
        Mahasiswa Lama = new Mahasiswa("Marvuah");
        Lama.ongkos();
        Lama.ongkos(2000,3);
        Mahasiswa Al = new Mahasiswa(20);
    }
}
