import java.util.ArrayList;
import java.util.List;

/**
 * Representa una Saga que implementa la interfaz Articulo.
 * Una saga contiene varios artículos (películas u otros).
 */
public class Saga implements Articulo {
    private String nombre;
    private String genero;
    private List<Articulo> articulos;

    /**
     * Constructor de la clase Saga.
     * @param nombre nombre de la saga
     * @param genero género de la saga
     */
    public Saga(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.articulos = new ArrayList<>();
    }

    /**
     * Agrega un artículo a la saga.
     * @param a artículo a agregar
     */
    public void addArticulo(Articulo cosa) {
        articulos.add(cosa);
    }

    /**
     * Obtiene la lista de artículos que forman parte de la saga.
     * @return lista de artículos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * Obtiene el nombre de la saga.
     * @return nombre de la saga
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Calcula el precio total de la saga con un descuento del 5%.
     * @return precio total con descuento
     */
    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Articulo pelicula : articulos) {
            precioTotal += pelicula.getPrecio();
        }
        return precioTotal * 0.95;
    }

    /**
     * Obtiene el género de la saga.
     * @return género de la saga
     */
    @Override
    public String getGenero() {
        return genero;
    }

    /**
     * Calcula la duración total de todos los artículos en la saga.
     * @return duración total
     */
    public int getDuracion(){
        int duracionTotal = 0;
        for (Articulo pelicula : articulos) {
            duracionTotal += pelicula.getDuracion();
        }
        return duracionTotal;
    }

    /**
     * Obtiene la sinopsis de la saga.
     * @return sinopsis de la saga (actualmente null)
     */
    public String getSinopsis(){
        return null;
    }

    /**
     * Obtiene el director de la saga.
     * @return director de la saga (actualmente null)
     */
    public String getDirector(){
        return null;
    }

    /**
     * Muestra la información de la saga y de los artículos que contiene.
     */
    @Override
    public void showInformacion() {
        System.out.println("Saga: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Contiene:");
        for (Articulo cosa : articulos) {
            System.out.println("  - " + cosa.getNombre() + " (" + cosa.getPrecio() + ")");
        }
    }
}
