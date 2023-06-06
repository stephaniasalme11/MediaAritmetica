package Ejercicios;
public class Persona {
        private String nombre;
        private String apellido;
        private int edad;
        private int ci;

    public Persona(String nombre, String apellido, int edad, int ci) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.ci = ci;
        }

        void imprimir () {
            System.out.println("Nombre: " +nombre);
            System.out.println("Apellido: " +apellido);
            System.out.println("Edad: " +edad);
            System.out.println("C.I: " +ci);
            System.out.println();
        }
        void votante (int edad) {
            if (edad >= 18){
                System.out.println("Es votante");
            }else {
                System.out.println("No es votante");
            }
        }

        public static void main(String args []){
            Persona p1 = new Persona ("Maria", "Perez", 20, 12345678);
            p1.votante(20);
            p1.imprimir();

            Persona p2 = new Persona("Jose", "Leon", 15, 87654321);
            p2.votante(15);
            p2.imprimir();
}

    }


