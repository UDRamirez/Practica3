public class Pelicula implements Articulo{
  String nombre;
  String director;
  String sinopsis;
  String genero;
  double precio;
  int duracion;

  public Pelicula(String nombre, String director, int duracion, String genero, String sinopsis, double precio) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.precio = precio;
    }
  
public String getNombre(){
  return nombre;
}
  
public String getDirector(){
  return director;
}
  
public String getSinopsis(){
  return sinopsis;
}
  
public String getGenero(){
  return genero;
}
  
public double getPrecio(){
  return precio;
}
  
public int getDuracion(){
  return duracion;
}
  
public void showInformacion(){
  System.out.println("\nPelicula: " + pelicula + 
                    "\nDirección: " + director +
                    "\nDuración: " + duracion + "minutos" +
                    "\nGénero:" + genero +
                    "\nPrecio: " + precio + "mx"
                    "\nTrama: " + sinopsis);
}


}
