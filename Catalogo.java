import java.util.*;

public class Catalogo {

    private List<Articulo> articulos = new ArrayList<>();
    private List<Articulo> articulosEsp = new ArrayList<>();

    public void addArticulo(Articulo art) {
        articulos.add(art);
    }

    public void mostrarCatalogo() {
        articulosEsp = new ArrayList<>();
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            obtenerArticulosRecursivosSinDuplicados(art, todos);
            if (!todos.contains(art)) {
                todos.add(art);  // Agregar saga u artículo raíz si no está
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

    public void filtarPorGenero(String genero) {
        articulosEsp = new ArrayList<>();
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            obtenerArticulosRecursivosSinDuplicados(art, todos);
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

    public void filtarPorCosto(double max) {
        articulosEsp = new ArrayList<>();
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            obtenerArticulosRecursivosSinDuplicados(art, todos);
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

    public void mostrarArticulo(String nombre) {
        List<Articulo> todos = new ArrayList<>();

        for (Articulo art : articulos) {
            obtenerArticulosRecursivosSinDuplicados(art, todos);
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

    public List<Articulo> getArticulos() {
        return articulos;
    }

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

    // 🔧 Método actualizado que evita duplicados al recorrer recursivamente
    private void obtenerArticulosRecursivosSinDuplicados(Articulo art, List<Articulo> resultado) {
        if (art instanceof Saga) {
            Saga saga = (Saga) art;
            for (Articulo contenido : saga.getArticulos()) {
                obtenerArticulosRecursivosSinDuplicados(contenido, resultado);
            }
        } else {
            if (!resultado.contains(art)) {
                resultado.add(art);
            }
        }
    }

    private String obtenerTipo(Articulo a) {
        if (a instanceof Pelicula) return "PELÍCULA";
        if (a instanceof DiscoAdapter) return "DISCO";
        if (a instanceof Saga) return "SAGA";
        return "ARTÍCULO";
    }
}
