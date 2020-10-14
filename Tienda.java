/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


/**
 *
 * @author gmora
 */
public class Tienda {
    int arco = 200;
    int casco = 250;
    int espada = 300;
    int hacha = 150;
    int pantalon = 400;
    int pecho = 400;
    int zapatos = 150;
    int consumible = 100;
    int compras;
    int cash = 1000;
    
    
    
    
     public int compra(int a){
        
        int compras;
        compras= cash - a;
        cash=compras;
         System.out.println("Su dinero actual despues de la compra es: "+compras);
        return compras;
}
     public int venta(int a){
         
         int venta;
         venta= (cash + (a/2));
         cash=venta;
         System.out.println("Su dinero actual despues de la compra es: "+venta);
         return venta;
     }
}
