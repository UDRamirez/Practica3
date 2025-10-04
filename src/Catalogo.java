import java.util.*;

/**
 * Clase que representa un catálogo de artículos.
 * Permite almacenar, mostrar y filtrar artículos como películas, discos o sagas.
 */
public class Catalogo {

    private List<Articulo> articulos = new ArrayList<>();
    private List<Articulo> articulosEsp = new ArrayList<>();

    /**
     * Agrega un artículo al catálogo.
     * @param art artículo a agregar
     */
    public void addArticulo(Articulo art) {
        articulos.add(art);
    }

    /**
     * Muestra todos los artículos disponibles en el catálogo.
     * Incluye artículos individuales y los contenidos en sagas, sin duplicados.
     */
    public void mostrarCatalogo() {
        articulosEsp = new ArrayList<>();
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            sinDuplicados(art, todos);
            if (!todos.contains(art)) {
                todos.add(art);  
            }
        }

        for (Articulo a : todos) {
            String tipo = obtenerTipo(a);
            System.out.println("[" + tipo + "] Nombre: " + a.getNombre() + " Precio: " + a.getPrecio());
        }

        articulosEsp = todos;
        seleccionar();
        System.out.println("Saliendo del catálogo...");
    }

    /**
     * Filtra los artículos del catálogo por género.
     * @param genero género a filtrar
     */
    public void filtarPorGenero(String genero) {
        articulosEsp = new ArrayList<>();
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            sinDuplicados(art, todos);
            if (!todos.contains(art)) {
                todos.add(art);
            }
        }

        for (Articulo a : todos) {
            if (a.getGenero().equalsIgnoreCase(genero)) {
                System.out.println("[" + obtenerTipo(a) + "] Nombre: " + a.getNombre() + " Precio: " + a.getPrecio());
                articulosEsp.add(a);
            }
        }

        seleccionar();
        System.out.println("Saliendo del catálogo...");
    }

    /**
     * Filtra los artículos del catálogo por precio máximo.
     * @param max precio máximo
     */
    public void filtarPorCosto(double max) {
        articulosEsp = new ArrayList<>();
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            sinDuplicados(art, todos);
            if (!todos.contains(art)) {
                todos.add(art);
            }
        }

        for (Articulo a : todos) {
            if (a.getPrecio() <= max) {
                System.out.println("[" + obtenerTipo(a) + "] Nombre: " + a.getNombre() + " Precio: " + a.getPrecio());
                articulosEsp.add(a);
            }
        }

        seleccionar();
        System.out.println("Saliendo del catálogo...");
    }

    /**
     * Muestra la información de un artículo específico por nombre.
     * @param nombre nombre del artículo
     */
    public void mostrarArticulo(String nombre) {
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            sinDuplicados(art, todos);
            if (!todos.contains(art)) {
                todos.add(art);
            }
        }

        boolean encontrado = false;
        for (Articulo a : todos) {
            if (a.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                a.showInformacion();
                encontrado = true;
            }
        }

        if (!encontrado)
            System.out.println("No se encontró el artículo.");
    }

    /**
     * Obtiene la lista de artículos raíz en el catálogo.
     * @return lista de artículos raíz
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * Permite al usuario seleccionar un artículo mostrado para ver más detalles.
     */
    private void seleccionar() {
        System.out.println("Si desea obtener más información sobre algún artículo, ingrese su nombre.");
        System.out.println("n o vacío para salir");

        boolean ejecutando = true;
        Scanner sc = new Scanner(System.in);

        while (ejecutando) {
            System.out.print("-> ");
            String opcion = sc.nextLine().trim().toLowerCase();
            if (opcion.isEmpty() || opcion.equals("n")) {
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

    /**
     * Obtiene recursivamente todos los artículos de un artículo (ej. los contenidos de una saga),
     * evitando duplicados.
     * @param art artículo raíz
     * @param resultado lista acumulada de artículos sin duplicados
     */
    private void sinDuplicados(Articulo art, List<Articulo> resultado) {
        if (art instanceof Saga) {
            Saga saga = (Saga) art;
            for (Articulo contenido : saga.getArticulos()) {
                sinDuplicados(contenido, resultado);
            }
        } else {
            if (!resultado.contains(art)) {
                resultado.add(art);
            }
        }
    }

    /**
     * Obtiene el tipo de un artículo (Pelicula, Disco, Saga o Articulo).
     * @param a artículo a evaluar
     * @return tipo en forma de texto
     */

    //Se añadio esto porque era dificil diferenciar que cosa era que
    private String obtenerTipo(Articulo a) {
        if (a instanceof Pelicula) return "PELÍCULA";
        if (a instanceof DiscoAdapter) return "DISCO";
        if (a instanceof Saga) return "SAGA";
        return "ARTÍCULO";
    }
}
