/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

public class Operaciones {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("coloca el numero 1: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("coloca el numero 2: "));
    }
    
    //metodo de suma
    public void sumar(){
        suma=numero1+numero2;
    }
    
    public void restar(){
        resta=numero1-numero2;
    }
    
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    
    public void dividir(){
        division=numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma de : "+numero1 +" + "+numero2+" es: "+suma );
        System.out.println("La resta de : "+numero1 +" - "+numero2+" es: "+resta );
        System.out.println("La multiplicacion de : "+numero1 +" * "+numero2+" es: "+multiplicacion );
        System.out.println("La division de : "+numero1 +" / "+numero2+" es: "+division );
    }
}
