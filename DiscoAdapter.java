public class DiscoAdapter implements Producto{

  private Disco disco
  
 public DiscoAdapter(Disco disco) {
        this.disco = disco;
    }
  
String getNombre(){
  return disco.getNombre();
}
  
String getDirector(){
  return null;
}
  
String getSinopsis(){
  return null;
}
  
String getGenero(){
  return disco.getGenero();
}
  
double getPrecio(){
  return disco.getPrecio();
}
  
int getDuracion(){
  return 0;
}
  
void showInformacion();
  

  
}
  
