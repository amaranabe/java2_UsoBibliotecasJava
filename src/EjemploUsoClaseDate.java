import java.util.*;
import java.text.*;


public class EjemploUsoClaseDate
{
  public static void main(String args[]) 
  {
   
      Date fechaActual = new Date( );
      SimpleDateFormat formatoParaFecha = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
      //Le damos formato
      System.out.println("Current Date: " + formatoParaFecha.format(fechaActual));

  }
}
