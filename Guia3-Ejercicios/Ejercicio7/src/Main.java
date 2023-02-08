import entidades.ServiceProducto;

public class Main {
    public static void main(String []args){
        ServiceProducto listaProductos = new ServiceProducto();
        listaProductos.crearProducto();
        listaProductos.mostrarLista();
        listaProductos.productoMayores();
        listaProductos.productoMenores();
    }
}
