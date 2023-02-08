package entidades;

import java.util.Comparator;

public class CompareProducto implements Comparator<Producto> {
    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.getTipo().compareTo(o2.getTipo());
    }
}
