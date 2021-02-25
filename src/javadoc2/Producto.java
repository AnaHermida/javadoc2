package javadoc2;

import java.util.Scanner;

/**
 * @author antoniodavid
 * @version 1.0
 * Clase Producto en la que desea desarrollar una aplicación para gestionar los productos de una fábrica. Tiene los atributos de nombre, serie(int) y precio.
 */

public class Producto {
    private String nombre;
    private int serie;
    private double precio;
    private String descripion;


    Producto() {
        this.nombre = "Defecto";
        this.serie = generar();
        this.precio = 0.0;
    }

    /**
     *
     * @param nombreM -> String del nombre del producto
     * @param serieM -> Numero de serie identificativo de cada producto
     * @param precioM -> Número Double del precio del producot
     */
    Producto(String nombreM, int serieM, double precioM){

        if(!nombre.equals(" ") || !nombre.equals("")){
            this.nombre=nombreM;
        }else
            this.nombre="Defecto";

        this.serie=generar();

        if (precio>0){
            this.precio=precioM;
        }else
            this.precio=0.0;

    }
    
    private int generar(){
        return (int) (Math.random()*100000 + 1);
    }

    /**
     * Devuelve el nombre del producto
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el nº de Serie
     * @return
     */
    public int getSerie() {
        return serie;
    }

    /**
     * Devuelve el precio del producto en double
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Guarda el nombre del producto
     * @param nombre
     */
    public void setNombre(String nombre) {
        do{
            this.nombre=nombre;
        }while(nombre.equals(" ") || nombre.equals(""));
    }

    /**
     * Guarda el precio del producto en double
     * @param precio
     */
    public void setPrecio(double precio) {
        do{
            this.precio=precio;
        }while(precio<0);
    }

    /**
     * Método pedirNombre por el que pide por pantalla el nombre del prodcuto
     */
    public void pedirNombre(){
            Scanner sc = new Scanner(System.in);
        do{
            System.out.println("INTRODUCE EL NOMBRE");
            String nom =sc.nextLine();
            this.nombre=nom;
        }while(nombre.equals(" ") || nombre.equals(""));
    }

    /**
     * Método pedriPrecio por el que pide el precio del producto por pantalla
     */
    public void pedirPrecio(){
        Scanner sc = new Scanner(System.in);
        double prec;
        do{
            System.out.println("INTRODUCE EL PRECIO");
            prec= sc.nextDouble();
            this.precio=prec;
        }while(prec<0);
    }

    /**
     * Método resumen que muestra un resumen de todos los atributos de cada producto
     */
    public void resumen(){
        System.out.println("INFORME DEL PRODUCTO\n---------------------------");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("SERIE: "+serie);
        System.out.println("PRECIO: "+precio+" €");
    }

    /**
     * Método boolean que recibe otro objeto producto y devuelve si los productos son exactamente iguales.
     * @param otroProducto
     * @return
     */
    public boolean iguales(Producto otroProducto){
        boolean correcto;

        if ((nombre.equals(otroProducto.nombre)) && (precio == otroProducto.precio) && (serie == otroProducto.serie)){
            correcto=true;
        }else correcto=false;
        System.out.println(correcto);
        return correcto;
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.setNombre("Nombreproducto");
        producto1.generar();
        producto1.setPrecio(2.5);


        producto1.resumen();

        Producto producto2 = new Producto();
        producto2.generar();
        producto2.setNombre("proc2");
        producto2.setPrecio(2.5);
        producto2.resumen();

        producto1.iguales(producto2);
    }



}
