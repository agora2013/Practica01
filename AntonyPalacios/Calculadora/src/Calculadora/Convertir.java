/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.lang.reflect.Array;

/**
 *
 * @author Usuario
 */
public class Convertir {
    private String cadena;


    public Convertir(String cadena) {
        this.cadena = cadena;
    } 
    
    
    
    char oper[]=new char[10];
    int numero[]=new int[10];

    

    
    
    public void transformar(String cad){
        char[] letras = cad.toCharArray();
        int a = 0, b=0;
        for(int i =0;i<=letras.length-1;i++){
            if(letras[i]=='/' || letras[i]=='*' || letras[i]=='+' || letras[i]=='-'){
                oper[a]=letras[i];
                a++;
            }else{
                numero[b]=letras[i];
                b++;
            }
        }
    }
    
    public int primero(){
        return numero[1];
    }
    
}
