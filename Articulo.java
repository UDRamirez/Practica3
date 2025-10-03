/**
 * La interfaz {@code Articulo} define el contrato para los artículos
 * que pueden formar parte del catálogo, como películas, discos u otros productos.
 * Cada artículo debe proporcionar información básica como nombre, género, precio
 * y duración, además de un método para mostrar su información.
 */
public interface Articulo {

    /**
     * Obtiene el nombre del artículo.
     * 
     * @return el nombre del artículo
     */
    String getNombre();

    /**
     * Obtiene el director del artículo.
     * Puede ser aplicable para películas u otros productos audiovisuales.
     * 
     * @return el nombre del director, o {@code null} si no aplica
     */
    String getDirector();

    /**
     * Obtiene la sinopsis o descripción del artículo.
     * 
     * @return la sinopsis del artículo
     */
    String getSinopsis();

    /**
     * Obtiene el género del artículo.
     * 
     * @return el género del artículo
     */
    String getGenero();

    /**
     * Obtiene el precio del artículo.
     * 
     * @return el precio del artículo
     */
    double getPrecio();

    /**
     * Obtiene la duración del artículo en minutos.
     * 
     * @return la duración del artículo
     */
    double getDuracion();

    /**
     * Muestra la información completa del artículo en consola.
     */
    void showInformacion();
}
