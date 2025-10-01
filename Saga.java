import java.util.ArrayList;
import java.util.List;

public class Saga{
    private String nombre;
    private List<Articulo> peliculas;

    public Saga(String nombre){
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }

    public void addPelicula(Pelicula Pelicula){
        this.peliculas.add(Pelicula);
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDirector(){
        if (peliculas.isEmpty()) return "Sin director disponible";
        
        String directores = "";
        
        for (int i = 0; i < peliculas.size(); i++) {
            Articulo elemento = peliculas.get(i);
            directores += "Director \"" + elemento.getNombre() + "\": " + elemento.getDirector() + "\n";
        }
        return directores;
    }

    public int getDuracion(){
        int duracionTotal = 0;
        for (Articulo pelicula : peliculas) {
            duracionTotal += pelicula.getDuracion();
        }
        return duracionTotal;
    }

    public String getGenero(){
        if (peliculas.isEmpty()) return "Sin género disponible";
        
        String generos = "";
        
        for (int i = 0; i < peliculas.size(); i++) {
            Articulo elemento = peliculas.get(i);
            generos += "Género \"" + elemento.getNombre() + "\": " + elemento.getGenero() + "\n";
        }
        return generos;
    }

    public String getSinopsis(){
        if (peliculas.isEmpty()) return "Sin sinopsis disponible";
        
        String sinopsis = "";
        
        for (int i = 0; i < peliculas.size(); i++) {
            Articulo elemento = peliculas.get(i);
            sinopsis += "Sinopsis \"" + elemento.getNombre() + "\": " + elemento.getSinopsis() + "\n";
        }
        return sinopsis;
    }

    public double getPrecio(){
        double precioTotal = 0;
        for (Articulo pelicula : peliculas) {
            precioTotal += pelicula.getPrecio();
        }
        return precioTotal * 0.95;
    }

    public void showInformacion(){
        System.out.println("=== SAGA: " + nombre.toUpperCase() + " ===");
        System.out.println("Duración total: " + getDuracion() + " minutos");
        System.out.println("Precio con descuento: $" + getPrecio());
        System.out.println("Elementos contenidos: " + peliculas.size());
        System.out.println("\n" + getSinopsis());
    }
}
