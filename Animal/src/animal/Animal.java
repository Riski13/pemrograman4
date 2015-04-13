/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Marvian
 */
public class Animal {
    protected int legs;
public Animal(){
    
}
protected void Animal(int legs){
    System.out.println("Berkaki " + legs);
}
public void Walk(){
    System.out.println("Bisa berjalan");
}
public void Eat(){
    System.out.println("Bisa makan");
    }
}

