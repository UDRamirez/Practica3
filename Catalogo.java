import java.util.*;

public class Catalogo{

    private List<Articulo> articulos = new ArrayList<>();
    private List<Articulo> articulosEsp = new ArrayList<>();

    public void addArticulo(Articulo art){
	articulos.add(art);

    }
    public void mostrarCatalogo(){
	articulosEsp = new ArrayList<>();
	if(articulos == null || articulos.isEmpty())
	    return;

	for(Articulo a: articulos){
	    System.out.println("Nombre: " + a.getNombre() + "Precio: " + a.getPrecio());  
	}
	articulosEsp = articulos;
	seleccionar();
	
	System.out.println("Saliendo del catálogo...");
	

    }
    public void filtarPorGenero(String genero){
	articulosEsp = new ArrayList<>();
	if(articulos == null || articulos.isEmpty())
	    return;

	for(Articulo a: articulos){
	    if(a.getGenero().equals(genero)){
		System.out.println("Nombre: " + a.getNombre() + "Precio: " + a.getPrecio());
		articulosEsp.add(a);
	    }
	}
	seleccionar();
	System.out.println("Saliendo del catálogo...");

    }
    public void filtarPorCosto(double max){
	articulosEsp = new ArrayList<>();
	if(articulos == null || articulos.isEmpty())
	    return;
       
	for(Articulo a: articulos){
	    if(a.getPrecio() <= max){
		System.out.println("Nombre: " + a.getNombre() + "Precio: " + a.getPrecio());
		articulosEsp.add(a);
	    }
	}
    }
    public void mostrarArticulo(String nombre){
	for(Articulo a: articulos){
	    if(a.getNombre().equals(nombre)){
		System.out.println("Nombre: " + a.getNombre() + "Precio: " + a.getPrecio());
		break;
	    }
	    
	}

    }
    public List<Articulo> getArticulos(){
	return articulos;

    }
    private void seleccionar(){
	System.out.println("Si desea obtener mas informacion sobre algun articulo ingrese su nombre.");
	System.out.println("n o vacio para salir");
	boolean ejecutando = true;
	Scanner sc = new Scanner(System.in);
	while(ejecutando){
	    String opcion = sc.next().trim().toLowerCase();
	    if(opcion.isEmpty() || opcion == null || opcion.equals("n")){
		ejecutando = false;
		continue;
	    }
	    boolean match = false;
	    for(Articulo a: articulosEsp){
		
		if(a.getNombre().trim().toLowerCase().equals(opcion)){
		    a.showInformacion();
		    match = true;
		}
	    }
	    if(!match)
		System.out.println("No se encontraron coincidencias");
		
	
	    
	}

    }

    

}
