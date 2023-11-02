/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;
import javax.swing.JOptionPane;
/**
 *
 * @author alexc
 */
public class Pila {
    private Nodo inicio;
    private int tamanio;
    
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    
    public void apilar1(char valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
           inicio = nuevo;
        }
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
       tamanio++;
    } 
    
    
  
    
        
    public void eliminar(){
        inicio = null;
        tamanio = 0;
    }
        
    public void listar1(String valor){
        Nodo aux = inicio; //nuevo nodo
        int x=0; //guarda indice de la cadena
        char letraa; //valor de la pila
        char letrab; //valor de la cadena
        
        while(aux != null){
            letraa = aux.getValor();
            letrab=valor.charAt(x);
            if (letraa != letrab)
            {
               JOptionPane.showMessageDialog(null, "No son palindromos");
               aux=null;
            }
            else
            {
               aux = aux.getSiguiente();
               x++;
              if (x==valor.length())
               {
                  JOptionPane.showMessageDialog(null, "Son palindromos"); 
               }   
            }
            
            
        }
    }
    
    
}
