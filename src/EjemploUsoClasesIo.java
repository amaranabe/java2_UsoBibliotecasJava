import java.io.*;
import java.util.*;

public class EjemploUsoClasesIo
{
	public static void main(String[] args) throws FileNotFoundException
	
	{
		 // Le pedimos al usuario el nombre del fichero 
		 //Declaramos e instanciamos una variable de tipo Scanner
		 Scanner sc = new Scanner(System.in);
		 //Escribimos en pantalla el siguiente texto para que el usuario sepa que tiene que introducir
		 System.out.println("Por favor introduzca el nombre del fichero"); 
		 //leemos lo que introduce el usuario
		 String nombrefichero = sc.next();

		// hay que declarar tres variables de tres tipo(clases) distintas
		 File archivo;
		 FileReader fr;
		 BufferedReader br;
		 
		  // En esta ocasión instanciamos en instrucciones diferentes en lugar de hacerlo en la misma que era a lo que estas acostumbrada (se podría hacer también en la misma instrucción)
		 // Instanciamos  (reservamos memoria, hacemos los news ) las variables declaradas, como puedes ver el nombre del fichero se le pasa como parametro en la
		 // instancia de archivo que es de la clase File
		 archivo = new File (nombrefichero);
		// fr es una variable del tipo de FileReader, sirve para tener acceso al fichero definido por archivo en modo lectura (que se lo pasas por parametro a la constructora)
		 fr = new FileReader (archivo);
		// br es una variable del tipo de BufferedReader, sirve para poder leer linea a linea de un fichero al que se tiene acceso en modo lectura a traves de otra variable de tipo FileReader (que se la pasas por parametro a la constructora)
		 br = new BufferedReader(fr);
		 
		// Declaración de la variable línea
		String linea;

		// la expresión condicional sería esta   (linea=br.readLine()) !=  null (es algo más compleja que las sueles utilizar)
		// como puedes ver está compuesta de una expresión de asignación  linea=br.readLine() y por el otro lado el valor null
		// primero se evaluan las expresiones a ambos lados del != y luego se evalua la condición
		// al evaluar la expresión de asignación se asigna lo que se devuelve al llamar al método readLine a línea
		// este valor será la siguiente linea del fichero y  cuando se termine el fichero esta función (método) devuelve null

		//while(   linea= br.readLine() !=  null  )
		//          System.out.println(linea);


		// Se podría poner de esta forma también, desglosado, para que lo entiendas mejor
		try
		{
			linea = br.readLine();
			while(linea !=  null)
			{
			       System.out.println(linea);
			       linea = br.readLine();
			}

		}
		catch (Exception e) 
		{
			System.out.println("Error");
		}
		
	}
}
