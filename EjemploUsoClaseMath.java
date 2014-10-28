import java.lang.Math;
import java.util.Scanner;
//De la Clase Math utilizamos método hypot, round, atan2 y pow
public class EjemploUsoClaseMath
{
   public static void main(String[] args) 
   {
	//Declaramos e instanciamos objeto de la clase Scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("Por favor introduzca la altura del triángulo");
	//Asignamos lo que devuelve el método nextInt a la variable declarada cateto1	
	int cateto1 = sc.nextInt();

	System.out.println("Por favor introduzca la base del triángulo");
	//Asignamos lo que devuelve el método nextInt a la variable declarada cateto1		
	int cateto2 = sc.nextInt();

	double hipotenusa;
	//Asignamos a hipotenusa el valor que devuelve el método hypot (calcula la hipotenusa)
        hipotenusa=Math.hypot (cateto1, cateto2);
	//Asignamos a hipotenusa el valor que devuelve el método round (redondea a un entero)
        hipotenusa=Math.round (hipotenusa);
        System.out.println ("La longitud de la hipotenusa es " + hipotenusa);

        double arcotangente;
	//Asignamos a arcotangente el valor que devuelve el método atan2 (calcula la arcotangente) introducido cómo parámetro del metodo round.	
	arcotangente=Math.round(Math.atan2(cateto2, cateto1));
        System.out.println ("El angulo de la hipotenusa con la horizontal es " + arcotangente);
     
        double area;
	//La constante PI está en la clase Math
        area=Math.PI*Math.pow(hipotenusa, 2);
        System.out.println ("El área de un circulo con el radio igual a la hipotenusa calculada es " + Math.round(area));

   }
}
