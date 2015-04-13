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
public class Fish extends Animal implements pet{
    String nama;
public Fish(){
    
}
public void fish (){
    System.out.println("Ikan cupang");
}
public void Eat(){
    System.out.println("Ikan makan");
}
public void walk(){
    System.out.println("Ikan berenang");
}
public void Play(){
    System.out.println("Main main");
}
public String getNama(){
    return nama;
}
public void setNama(String Newnam){
    nama = Newnam;
}   
}
