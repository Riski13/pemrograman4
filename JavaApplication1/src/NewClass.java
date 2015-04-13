/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Riski
 */
public class NewClass {
    public static void main(String[] args){
        //BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        Scanner dataIn = new Scanner(System.in);
        String name;
        System.out.print("Masukan Nama : ");
        //try{
        //    name = dataIn.readLine();
        //}catch(IOException e){
        //    System.out.println("Error!");
        //}
        name = dataIn.nextLine();
        System.out.println("Hello " + name);
    }
}
