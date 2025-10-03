/**
 * La clase {@code Disco} representa un producto musical dentro del catálogo.
 * Contiene información básica como nombre, artista, género, año de lanzamiento y precio.
 * <p>
 * Esta clase no implementa la interfaz {@link Articulo} directamente, por lo que
 * puede ser adaptada mediante un patrón Adapter para integrarse con el resto del sistema.
 * </p>
 */
public class Disco {

    /** Nombre del disco. */
    private String nombre;

    /** Nombre del artista o banda que interpreta el disco. */
    private String artista;

    /** Género musical del disco (ej. rock, pop, jazz). */
    private String genero;

    /** Año de lanzamiento del disco. */
    private int año;

    /** Precio del disco. */
    private double precio;

    /**
     * Crea un nuevo disco con los datos proporcionados.
     *
     * @param nombre  el nombre del disco
     * @param artista el nombre del artista o banda
     * @param genero  el género musical
     * @param año     el año de lanzamiento
     * @param precio  el precio del disco
     */
    public Disco(String nombre, String artista, String genero, int año, double precio) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.año = año;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del disco.
     *
     * @return el nombre del disco
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el nombre del artista o banda.
     *
     * @return el nombre del artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Obtiene el género musical del disco.
     *
     * @return el género musical
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Obtiene el año de lanzamiento del disco.
     *
     * @return el año de lanzamiento
     */
    public int getAño() {
        return año;
    }

    /**
     * Obtiene el precio del disco.
     *
     * @return el precio del disco
     */
    public double getPrecio() {
        return precio;
    }
}
