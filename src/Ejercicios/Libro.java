//Escribir un programa en Java que modele la clase libro. La clase debe incluir los métodos crear dos objetos
// y para imprimir por pantalla los valores de los atributos. Por: Stephanía Salmerón. Para: Programación II - UBA
package Ejercicios;
public class Libro {
        private String titulo;
        private String autor;
        private String cantidad;

        public Libro(String titulo, String autor, String cantidad) {
            this.titulo = titulo;
            this.autor = autor;
            this.cantidad = cantidad;
        }        void imprimir () {
            System.out.println("Titulo: " +titulo);
            System.out.println("Autor: " +autor);
            System.out.println("Cantidad de páginas: " + cantidad);
            System.out.println();
        }

        public static void main(String args []){
            Libro l1 = new Libro ("Veronica decide Morir ", "Paulo Coelho","221 pag");
            l1.imprimir();

            Libro l2 = new Libro ("La Conspiración ", "Dan Brown", "608 pag");
            l2.imprimir();
        }

    }



