/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "SUMA", "Operacion Suma", 3);
        //int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        //int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        String cadena = JOptionPane.showInputDialog("Ingrese un palabra");
        
        //Operaciones op = new Operaciones(a,b);
        //op.suma();
        
        Convertir  con = new Convertir(cadena);
        con.transformar(cadena);
        
        
        //JOptionPane.showMessageDialog(null, "La suma es "+op.suma());
        JOptionPane.showMessageDialog(null, "el numero: "+con.primero());
    }
}
