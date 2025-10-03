/**
 * La clase {@code DiscoAdapter} actúa como un adaptador que permite
 * que un objeto de tipo {@link Disco} se utilice como un {@link Articulo}.
 * <p>
 * Dado que {@code Disco} no implementa directamente la interfaz
 * {@link Articulo}, este adaptador proporciona los métodos necesarios
 * para integrarlo dentro del sistema de catálogo.
 * </p>
 */
public class DiscoAdapter implements Articulo {

    /** Objeto de tipo {@link Disco} que será adaptado. */
    private Disco disco;

    /**
     * Crea un nuevo adaptador para el disco especificado.
     *
     * @param disco el objeto {@link Disco} a adaptar
     */
    public DiscoAdapter(Disco disco) {
        this.disco = disco;
    }

    /**
     * {@inheritDoc}
     */
    public String getNombre() {
        return disco.getNombre();
    }

    /**
     * {@inheritDoc}
     * <p>
     * No aplica para un disco, por lo que retorna {@code null}.
     * </p>
     */
    public String getDirector() {
        return null;
    }

    /**
     * {@inheritDoc}
     * <p>
     * No aplica para un disco, por lo que retorna {@code null}.
     * </p>
     */
    public String getSinopsis() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getGenero() {
        return disco.getGenero();
    }

    /**
     * {@inheritDoc}
     */
    public double getPrecio() {
        return disco.getPrecio();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Un disco no tiene duración en minutos como una película,
     * por lo que retorna {@code 0}.
     * </p>
     */
    public int getDuracion() {
        return 0;
    }

    /**
     * {@inheritDoc}
     * <p>
     * En el caso de un disco, muestra su nombre, artista, género,
     * año de lanzamiento y precio.
     * </p>
     */
    public void showInformacion() {
        System.out.println("\nDisco: " + disco.getNombre() +
                           "\nArtista: " + disco.getArtista() +
                           "\nGénero: " + disco.getGenero() +
                           "\nAño: " + disco.getAño() +
                           "\nPrecio: " + disco.getPrecio() + " mx");
    }
}
