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
  
String getNombre(){
  return nombre;
}
  
String getDirector(){
  return director;
}
  
String getSinopsis(){
  return sinopsis;
}
  
String getGenero(){
  return genero;
}
  
double getPrecio(){
  return precio;
}
  
int getDuracion(){
  return duracion;
}
  
void showInformacion();


}
