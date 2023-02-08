package entidades;

import java.util.Comparator;

public class ComparatorPerro implements Comparator<Perro> {
    @Override
    public int compare(Perro o1, Perro o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
