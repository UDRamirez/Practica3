import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Saga} representa un conjunto de artículos (como películas o discos)
 * agrupados bajo un mismo nombre. Implementa la interfaz {@link Articulo} y permite
 * obtener información consolidada de todos los artículos que contiene.
 * <p>
 * Además, aplica un descuento en el precio total de los artículos de la saga.
 * </p>
 */
public class Saga implements Articulo {

    /** Nombre de la saga. */
    private String nombre;

    /** Lista de artículos que conforman la saga. */
    private List<Articulo> articulos;

    /** Género principal de la saga. */
    private String genero;

    /**
     * Crea una nueva saga con el nombre y género especificados.
     *
     * @param nombre el nombre de la saga
     * @param genero el género principal de la saga
     */
    public Saga(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.articulos = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Agrega un artículo a la saga.
     *
     * @param articulo el artículo a añadir
     */
    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Devuelve los directores de todos los artículos de la saga en forma de lista.
     * </p>
     *
     * @return una cadena con los nombres de los directores de cada artículo
     */
    public String getDirector() {
        String directores = "";
        for (int i = 0; i < articulos.size(); i++) {
            Articulo elemento = articulos.get(i);
            directores += "Director \"" + elemento.getNombre() + "\": " + elemento.getDirector() + "\n";
        }
        return directores;
    }

    /**
     * {@inheritDoc}
     * <p>
     * La duración es la suma de las duraciones de todos los artículos.
     * </p>
     *
     * @return la duración total en minutos
     */
    public int getDuracion() {
        double duracionTotal = 0;
        for (Articulo pelicula : articulos) {
            duracionTotal += pelicula.getDuracion();
        }
        return duracionTotal;
    }

    /**
     * {@inheritDoc}
     */
    public String getGenero() {
        return genero;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Devuelve una lista de sinopsis de todos los artículos de la saga.
     * </p>
     *
     * @return una cadena con las sinopsis de cada artículo
     */
    public String getSinopsis() {
       return null;
    }

    /**
     * {@inheritDoc}
     * <p>
     * El precio total corresponde a la suma de los precios de todos los artículos,
     * aplicando un descuento del 5%.
     * </p>
     *
     * @return el precio total con descuento
     */
    public double getPrecio() {
        double precioTotal = 0;
        for (Articulo pelicula : articulos) {
            precioTotal += pelicula.getPrecio();
        }
        return precioTotal * 0.95;
    }

    /**
     * {@inheritDoc}
     * <p>
     * En el caso de una saga, muestra el nombre, la duración total,
     * el precio con descuento, la cantidad de artículos y las sinopsis.
     * </p>
     */
    public void showInformacion() {
        System.out.println("=== SAGA: " + nombre + " ===");
        System.out.println("Duración total: " + getDuracion() + " minutos");
        System.out.println("Precio con descuento: $" + getPrecio());
        System.out.println("Elementos contenidos: " + articulos.size());
        System.out.println("\n" + getSinopsis());
    }
}
