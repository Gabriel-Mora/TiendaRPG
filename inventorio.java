package main;

/**
 *
 * @author gmora
 */

public class inventorio {
    Tienda articulo = new Tienda();
    Main jugador =new Main();
    int arco = 0;
    int casco = 0;
    int espada = 0;
    int hacha = 0;
    int pantalon = 0;
    int pecho = 0;
    int zapatos = 0;
    int consumible = 0;
    int inventorio = 0; 
    
    
    public void max(){
        if (inventorio>7){
            System.out.println("La capacidad de su iventorio está al Máximo, no es posible realizar más compras");
        }
        
    
    }        
 }
