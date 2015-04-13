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
public class Mahasiswa {
    private String Nama;
    int Umur;
    int ongkos;
    
 public Mahasiswa(){  //konstruktor Kosong
 }
 
 public Mahasiswa(String Nama){ //Konstruktor berisi string
     System.out.print(Nama);
 }
 public Mahasiswa(int umur){
     System.out.println(umur);
 }
 
// public Mahasiswa(int Umur){
//     
// }
 
 public void ongkos(){
     System.out.print("=");
 }
 public void umur(int umur){
     System.out.println("Umur " + umur);
 }
 public void ongkos(int ongkos){
     ongkos = ongkos * 2;
     System.out.println(ongkos);
 }
 public void ongkos(int ongkos , int ongkos1){
     ongkos = ongkos1 * ongkos;
     System.out.println(ongkos);
 }
}
