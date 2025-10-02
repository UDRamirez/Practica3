import java.util.ArrayList;
import java.util.List;

public class Saga implements Articulo{
    private String nombre;
    private List<Articulo> articulos;

    public Saga(String nombre){
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }

    public void agregaElemento(Articulo articulo){
        this.articulos.add(articulo);
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDirector(){
        if (articulos.isEmpty()) return "Sin director disponible";
        
        String directores = "";
        
        for (int i = 0; i < articulos.size(); i++) {
            Articulo elemento = articulos.get(i);
            directores += "Director \"" + elemento.getNombre() + "\": " + elemento.getDirector() + "\n";
        }
        return directores;
    }

    public double getDuracion(){
        double duracionTotal = 0;
        for (Articulo pelicula : articulos) {
            duracionTotal += pelicula.getDuracion();
        }
        return duracionTotal;
    }

    public String getGenero(){
        if (articulos.isEmpty()) return "Sin género disponible";
        
        String generos = "";
        
        for (int i = 0; i < articulos.size(); i++) {
            Articulo elemento = articulos.get(i);
            generos += "Género \"" + elemento.getNombre() + "\": " + elemento.getGenero() + "\n";
        }
        return generos;
    }

    public String getSinopsis(){
        if (articulos.isEmpty()) return "Sin sinopsis disponible";
        
        String sinopsis = "";
        
        for (int i = 0; i < articulos.size(); i++) {
            Articulo elemento = articulos.get(i);
            sinopsis += "Sinopsis \"" + elemento.getNombre() + "\": " + elemento.getSinopsis() + "\n";
        }
        return sinopsis;
    }

    public double getPrecio(){
        double precioTotal = 0;
        for (Articulo pelicula : articulos) {
            precioTotal += pelicula.getPrecio();
        }
        return precioTotal * 0.95;
    }

    public void showInformacion(){
        System.out.println("=== SAGA: " + nombre + " ===");
        System.out.println("Duración total: " + getDuracion() + " minutos");
        System.out.println("Precio con descuento: $" + getPrecio());
        System.out.println("Elementos contenidos: " + articulos.size());
        System.out.println("\n" + getSinopsis());
    }
}
