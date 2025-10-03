/**
 * La clase {@code Pelicula} representa un artículo de tipo película
 * dentro del catálogo. Implementa la interfaz {@link Articulo} y
 * contiene información como el nombre, director, duración, género,
 * sinopsis y precio.
 */
public class Pelicula implements Articulo {

    /** Nombre de la película. */
    String nombre;

    /** Nombre del director de la película. */
    String director;

    /** Sinopsis o trama de la película. */
    String sinopsis;

    /** Género de la película (ej. acción, drama, comedia). */
    String genero;

    /** Precio de la película. */
    double precio;

    /** Duración de la película en minutos. */
    int duracion;

    /**
     * Crea una nueva película con los datos proporcionados.
     *
     * @param nombre   el nombre de la película
     * @param director el director de la película
     * @param duracion la duración de la película en minutos
     * @param genero   el género de la película
     * @param sinopsis la sinopsis o trama de la película
     * @param precio   el precio de la película
     */
    public Pelicula(String nombre, String director, int duracion, String genero, String sinopsis, double precio) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.precio = precio;
    }

    /**
     * {@inheritDoc}
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * {@inheritDoc}
     */
    public String getDirector() {
        return director;
    }

    /**
     * {@inheritDoc}
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * {@inheritDoc}
     */
    public String getGenero() {
        return genero;
    }

    /**
     * {@inheritDoc}
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la duración de la película.
     *
     * @return la duración en minutos
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * {@inheritDoc}
     * <p>
     * En el caso de una película, muestra en consola:
     * nombre, director, duración, género, precio y sinopsis.
     * </p>
     */
    public void showInformacion() {
        System.out.println("\nPelicula: " + nombre +
                           "\nDirección: " + director +
                           "\nDuración: " + duracion + " minutos" +
                           "\nGénero: " + genero +
                           "\nPrecio: " + precio + " mx" +
                           "\nTrama: " + sinopsis);
    }
}
