/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalfa;
import java.util.Scanner;

/**
 * @author amantillapousa
 * 1º ejercicio para trabajar con Git.
 * Calculadora temperatura. 
 */
public class Proyectoalfa {


    public static void main(String[] args) {
       
        int centigrados;
        int resultado;
        double fahr;
        fahr = 33.8;
        double kelv;
        kelv = 274.15;
        
        Scanner numero= new Scanner (System.in);
        
        System.out.print("Ingrese el valor de ºC: ");
        centigrados = numero.nextInt();
        
        System.out.print(System.getProperty("line.separator"));
        
        System.out.print ("Resultado ºF: "+(centigrados+fahr));
        
        System.out.print(System.getProperty("line.separator"));
        
        System.out.print("Resultado ºK: "+(centigrados+kelv)+"\n");
        //Buenos días, me gustaría alquilar Batman Forever
        //No es posible, tiene que devolverla tomorrow
    }
    
}
