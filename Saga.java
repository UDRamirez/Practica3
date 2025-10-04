import java.util.ArrayList;
import java.util.List;

public class Saga implements Articulo {
    private String nombre;
    private String genero;
    private List<Articulo> articulos;

    public Saga(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.articulos = new ArrayList<>();
    }

    public void addArticulo(Articulo a) {
        articulos.add(a);
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Articulo pelicula : articulos) {
            precioTotal += pelicula.getPrecio();
        }
        return precioTotal * 0.95;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    public int getDuracion(){
	int duracionTotal = 0;
        for (Articulo pelicula : articulos) {
            duracionTotal += pelicula.getDuracion();
        }
        return duracionTotal;
    }

    public String getSinopsis(){
	return null;
    }

    public String getDirector(){
	return null;
    }

    @Override
    public void showInformacion() {
        System.out.println("Saga: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Contiene:");
        for (Articulo a : articulos) {
            System.out.println("  - " + a.getNombre() + " (" + a.getPrecio() + ")");
        }
    }
}
