import java.lang.Math;
import java.util.Scanner;

public class EjemploUsoClaseMath
{
   public static void main(String[] args) 
   {
  
       Scanner sc = new Scanner(System.in);
       System.out.println("Por favor introduzca la altura del triángulo");
       int cateto1 = sc.nextInt();

       System.out.println("Por favor introduzca la base del triángulo");
       int cateto2 = sc.nextInt();

        double hipotenusa;
        hipotenusa=Math.hypot (cateto1, cateto2);
        hipotenusa=Math.round (hipotenusa);
        System.out.println ("La longitud de la hipotenusa es " + hipotenusa);

        double arcotangente;
        arcotangente=Math.round(Math.atan2(cateto1, cateto2));
        System.out.println ("El angulo de la hipotenusa con la horizontal es " + arcotangente);
     
        double area;
        area=Math.PI*Math.pow(hipotenusa, 2);
        System.out.println ("El área de un circulo con el radio igual a la hipotenusa calculada es " + Math.round(area));

   }
}