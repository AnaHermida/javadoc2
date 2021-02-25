/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoc2;

/**
 *
 * @author anah
 */
public class Javadoc2 {


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Pedido pedido= new Pedido();
    
         pedido.pedirProducto(1);
         pedido.total();
    }
    
}
