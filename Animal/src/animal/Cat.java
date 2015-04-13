package animal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marvian
 */
public class Cat extends Animal implements pet{
    String Nama;
    public Cat(){   
    }
public void cat(String nama){
   System.out.println(Nama);
}
public void cat(){
    System.out.println("Overload");
}
public void Eat(){
    System.out.println("Kucing makan tulang");
}
public void Play(){
    System.out.println("Main main");
}
public String getNama(){
    return Nama;
}
public void setNama(String name){
    Nama = name;
}
}
