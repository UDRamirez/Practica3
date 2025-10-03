import java.util.*;

/**
 * La clase {@code Catalogo} representa una colección de artículos
 * (películas, discos, sagas, etc.) que implementan la interfaz {@link Articulo}.
 * <p>
 * Permite agregar artículos, mostrarlos, filtrarlos por género o costo,
 * y consultar información detallada de un artículo en específico.
 * </p>
 */
public class Catalogo {

    /** Lista principal de artículos en el catálogo. */
    private List<Articulo> articulos = new ArrayList<>();

    /** Lista de artículos filtrados temporalmente. */
    private List<Articulo> articulosEsp = new ArrayList<>();

    /**
     * Agrega un artículo al catálogo.
     *
     * @param art el artículo a añadir
     */
    public void addArticulo(Articulo art) {
        articulos.add(art);
    }

    /**
     * Muestra en consola todos los artículos del catálogo junto con su precio.
     * <p>
     * Al finalizar, permite al usuario seleccionar un artículo para ver más detalles.
     * </p>
     */
    public void mostrarCatalogo() {
        articulosEsp = new ArrayList<>();
        if (articulos == null || articulos.isEmpty())
            return;

        for (Articulo a : articulos) {
            System.out.println("Nombre: " + a.getNombre() + " Precio: " + a.getPrecio());
        }
        articulosEsp = articulos;
        seleccionar();

        System.out.println("Saliendo del catálogo...");
    }

    /**
     * Filtra y muestra los artículos del catálogo por género.
     * <p>
     * Al finalizar, permite al usuario seleccionar un artículo para ver más detalles.
     * </p>
     *
     * @param genero el género a filtrar
     */
    public void filtarPorGenero(String genero) {
        articulosEsp = new ArrayList<>();
        if (articulos == null || articulos.isEmpty())
            return;

        for (Articulo a : articulos) {
            if (a.getGenero().equals(genero)) {
                System.out.println("Nombre: " + a.getNombre() + " Precio: " + a.getPrecio());
                articulosEsp.add(a);
            }
        }
        seleccionar();
        System.out.println("Saliendo del catálogo...");
    }

    /**
     * Filtra y muestra los artículos cuyo precio es menor o igual al valor máximo dado.
     *
     * @param max el precio máximo permitido
     */
    public void filtarPorCosto(double max) {
        articulosEsp = new ArrayList<>();
        if (articulos == null || articulos.isEmpty())
            return;

        for (Articulo a : articulos) {
            if (a.getPrecio() <= max) {
                System.out.println("Nombre: " + a.getNombre() + " Precio: " + a.getPrecio());
                articulosEsp.add(a);
            }
        }
    }

    /**
     * Muestra la información básica (nombre y precio) de un artículo específico
     * identificado por su nombre.
     *
     * @param nombre el nombre del artículo a buscar
     */
    public void mostrarArticulo(String nombre) {
        for (Articulo a : articulos) {
            if (a.getNombre().equals(nombre)) {
                System.out.println("Nombre: " + a.getNombre() + " Precio: " + a.getPrecio());
                break;
            }
        }
    }

    /**
     * Devuelve la lista completa de artículos en el catálogo.
     *
     * @return la lista de artículos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * Método auxiliar que permite al usuario escribir el nombre de un artículo
     * para ver su información detallada.
     * <p>
     * Si el usuario introduce "n" o una entrada vacía, el proceso termina.
     * </p>
     */
    private void seleccionar() {
        System.out.println("Si desea obtener más información sobre algún artículo, ingrese su nombre.");
        System.out.println("n o vacío para salir");
        boolean ejecutando = true;
        Scanner sc = new Scanner(System.in);
        while (ejecutando) {
            String opcion = sc.next().trim().toLowerCase();
            if (opcion == null || opcion.isEmpty() || opcion.equals("n")) {
                ejecutando = false;
                continue;
            }
            boolean match = false;
            for (Articulo a : articulosEsp) {
                if (a.getNombre().trim().toLowerCase().equals(opcion)) {
                    a.showInformacion();
                    match = true;
                }
            }
            if (!match)
                System.out.println("No se encontraron coincidencias");
        }
    }
}
