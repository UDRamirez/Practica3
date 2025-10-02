public class Disco{
  private String nombre;
  private String artista;
  private String genero;
  private int año;
  private double precio;

  public Disco (String nombre, String artista, String genero, int año, double precio){
    this.nombre = nombre;
    this.artista = artista;
    this.genero = genero;
    this.año = año;
    this.precio = precio;
  }

  public String getNombre(){
    return nombre;
  }

  public String getArtista(){
    return artista;
  }

  public String getGenero(){
    return genero;
  }

  public int getAño(){
    return año;
  }

  public double getPrecio(){
  return precio;
  }
}
