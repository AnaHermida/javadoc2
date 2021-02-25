
package javadoc2;
        
import java.util.Scanner;

/**
 * @author antoniodavid
 * @version 1.0
 * Clase Pedido que pertenece al paquete Fábrica que tendrá 3 atributos que son objetos de la Clase producto
 * @see Producto
 */
public class Pedido {

    private Producto producto1 = new Producto();
    private Producto producto2 = new Producto();
    private Producto producto3 = new Producto();


    public Pedido(){
        producto1 = new Producto();
        producto2 = new Producto();
        producto3 = new Producto();
    }

    /**
     * Método pedirProducto que reciba un entero indicando cual de los tres
     * productos se va a introducir y pida por teclado su nombre y su precio. Este método
     * deberá comprobar que el número facilitado es válido (1,2 o 3).
     * @param num
     */
    public void pedirProducto(int num){
        Scanner sc = new Scanner(System.in);
        switch (num) {
            case 1:
                System.out.println("INTRODUZCA EL NOMBRE Y EL PRECIO DEL PRODUCTO 1");
                System.out.print("NOMBRE:");
                producto1.setNombre(sc.nextLine());
                System.out.print("PRECIO: ");
                producto1.setPrecio(sc.nextDouble());
                break;
            case 2:
                System.out.println("INTRODUZCA EL NOMBRE Y EL PRECIO DEL PRODUCTO 2");
                System.out.print("NOMBRE:");
                producto2.setNombre(sc.nextLine());
                System.out.print("PRECIO: ");
                producto2.setPrecio(sc.nextDouble());
                break;
            case 3:
                System.out.println("INTRODUZCA EL NOMBRE Y EL PRECIO DEL PRODUCTO 3");
                System.out.print("NOMBRE:");
                producto3.setNombre(sc.nextLine());
                System.out.print("PRECIO: ");
                producto3.setPrecio(sc.nextDouble());
                break;
            default:
                System.out.println("TIENES QUE INTRODUCIR UN NÚMERO CORRECTO (1, 2, 3)");

        }
    }

    /**
     * Método total que devuelva el importe del pedido, que es la suma del precio de
     * los tres productos.
     */
    public void total(){
        System.out.println("LA SUMA DEL TOTAL DEL PEDIDO ES:"+(producto1.getPrecio()+ producto2.getPrecio()+ producto3.getPrecio())+" €");
    }

    /**
     * Método mostrarPedido que muestre el resumen de los 3 productos así como
     * el total del pedido.
     */

    private void mostrarPedido() {
        System.out.println("PRODUCTO 1.\n-----------------");
        producto1.resumen();
        System.out.println("PRODUCTO 2.\n-----------------");
        producto2.resumen();
        System.out.println("PRODUCTO 3.\n-----------------");
        producto3.resumen();

    }

    /**
     * Main que cree 1 pedido, pida los datos de los tres
     * productos, después compare si los productos 1 y 3 son iguales o distintos y por
     * último muestre la información del pedido.
     * @param args
     */
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        System.out.println("PEDIDO 1");
        pedido1.pedirProducto(1);
        pedido1.pedirProducto(2);
        pedido1.pedirProducto(3);
        pedido1.producto1.iguales(pedido1.producto3);
        pedido1.total();
        pedido1.mostrarPedido();

    }



}
