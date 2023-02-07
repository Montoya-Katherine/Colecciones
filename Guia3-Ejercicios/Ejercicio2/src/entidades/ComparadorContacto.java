package entidades;

import java.util.Comparator;

public class ComparadorContacto implements Comparator<Contacto> {
    @Override
    public int compare(Contacto o1, Contacto o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
