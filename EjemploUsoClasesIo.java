import java.io.*;
import java.util.*;

public class EjemploUsoClasesIo
{
	public static void main(String[] args) throws FileNotFoundException
	
	{
		 
		 //Declaramos e instanciamos una objeto de tipo Scanner
		 Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario el nombre del fichero. Escribimos en pantalla el siguiente texto siguiente
		 System.out.println("Por favor introduzca el nombre del fichero"); 
		 //Leemos lo que introduce el usuario por teclado
		 String nombrefichero = sc.next();

		// Declaramos objetos de tres clases distintas
		 File archivo;
		 FileReader fr;
		 BufferedReader br;
		 
		// Se instancia el archivo que es de la clase File. El fichero se le pasa como parametro
		 archivo = new File (nombrefichero);
		// fr es un objeto del tipo de FileReader, sirve para tener acceso al fichero definido por archivo en modo lectura (que se lo pasas por parametro a la constructora)
		 fr = new FileReader (archivo);
		// br es un objeto del tipo de BufferedReader, sirve para poder leer linea a linea de un fichero al que se tiene acceso en modo lectura a traves de otra variable de tipo FileReader (que se la pasas por parametro a la constructora)
		 br = new BufferedReader(fr);
		 
		// Declaración de la variable linea
		String linea;

		//Al evaluar la expresión de asignación se asigna a linea, lo que se devuelve al llamar al método readLine. Este valor será la siguiente línea del fichero y  cuando se termine el fichero este método devolverá null y finalizará el bucle. Este método también es capaz de lanzar una excepción, por ello, utilizamos un bloque try-catch para recoger las excepciones emitidas por ese método.
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
