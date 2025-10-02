public class DiscoAdapter implements Producto{

    private Disco disco;
  
 public DiscoAdapter(Disco disco) {
        this.disco = disco;
    }
  
public String getNombre(){
  return disco.getNombre();
}
  
public String getDirector(){
  return null;
}
  
public String getSinopsis(){
  return null;
}
  
public String getGenero(){
  return disco.getGenero();
}
  
public double getPrecio(){
  return disco.getPrecio();
}
  
public int getDuracion(){
  return 0;
}
  
public void showInformacion(){
    System.out.println("\nDisco: " + disco.getNombre() +
                           "\nArtista: " + disco.getArtista() +
                           "\nGénero: " + disco.getGenero() +
                           "\nAño: " + disco.getAño() +
                           "\nPrecio: " + disco.getPrecio() + " mx");
}  

  
}
  
