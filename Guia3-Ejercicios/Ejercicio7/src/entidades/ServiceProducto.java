package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiceProducto {
   private ArrayList<Producto> listaProducto;

    public ServiceProducto() {
        this.listaProducto = new ArrayList<>();
    }

    public Producto aniadirProducto(String tipo, int cantidad, double precio){
        Producto producto = new Producto(tipo, cantidad, precio);
        return producto;
    }

    public ArrayList<Producto> crearProducto() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String opcion= "";

        System.out.println("Ingrese PRODUCTO");
        do {
            System.out.println("Tipo de producto");
            String tipo = scanner.next();

            System.out.println("Cantidad");
            int cantidad = scanner.nextInt();

            System.out.println("Precio");
            double precio = scanner.nextDouble();

            this.listaProducto.add(aniadirProducto(tipo,cantidad,precio));

            System.out.println("'S' para agregar producto. Salir cualquier tecla");
            opcion = scanner.next();
        }while (opcion.equalsIgnoreCase("s"));

        return this.listaProducto;
    }

    public void mostrarLista(){
        Collections.sort(this.listaProducto, new CompareProducto());

        System.out.println("Lista de PRODUCTOS");
        for (Producto productos : this.listaProducto) {
            System.out.println(productos);
        }
    }

    public void productoMayores(){
        System.out.println("Productos mayor a $20= ");
        for (int i = 0; i < this.listaProducto.size(); i++) {
            if (listaProducto.get(i).getPrecio()>20){
                System.out.println("Producto: " +
                        listaProducto.get(i).getTipo());
            }

        }
    }
    public void productoMenores(){
        System.out.println("Productos menor a $100= ");
        for (int i = 0; i < this.listaProducto.size(); i++) {
            if (listaProducto.get(i).getPrecio()<100){
                System.out.println("Producto: " +
                        listaProducto.get(i).getTipo());
            }

        }
    }
}
