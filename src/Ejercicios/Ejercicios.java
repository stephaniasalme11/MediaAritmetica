// Escribir un programa en Java que calcule la media aritmética de 5 números enteros. Por Stephanía Salmerón.
//Para Programación II: UBA
package Ejercicios;
public class Ejercicios {
    public static void main(String[] args) {
        float  a = 2, b = 3, c = 4, d = 8, e = 5;
        float sum = a+b+c+d+e; // se suman los numeros
        System.out.println ("La suma de los numeros es: " + sum);

        float media = sum/5;// se divde el resultado entre la candtidad de numeros
        System.out.println ("La Media aritmética de los numeros es: " + media); // se muestra por pantalla el resukltado final

    }
}
