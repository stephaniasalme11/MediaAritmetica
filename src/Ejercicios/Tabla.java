// Escribir un programa en Java que lea un número entero y, a continuación, visualice la tabla de multiplicar. Por: Stephania
//Salmeron. Para Programación II: UBA.
package Ejercicios;
import java.util.Scanner;
public class Tabla {
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        int n; // se declara una variable n
        System.out.println("Ingrese un numero entero: ");
        n = x.nextInt();
        System.out.println("La tabla de multiplicación del " + n + " es: ");
        for (int i=1; i<11; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
