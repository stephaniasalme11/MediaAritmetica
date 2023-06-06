// Escribir un programa en Java para agregar productos y generar la lista. Por Stephanía Salmeron
// Para: Progranmación II-UBA.
package Ejercicios;
import java.util.*;
import java.util.Scanner;
public class lista {
    public static void main (String [] args){
        int dis=0, j, i = 0;
        String pro;
        List<String>producto=new ArrayList<String>();
        List <Integer>disponibles=new ArrayList<Integer>();

        Scanner almacenar1 = new Scanner (System.in);
        Scanner almacenar2 = new Scanner (System.in);

        while(dis>=0) {
            System.out.println("Coloque el nombre del producto: ");
            pro=almacenar1.nextLine();
            System.out.println("Cloque la disponibilidad: ");
            dis=almacenar2.nextInt();
            if (dis>=0) {
                i++;
                producto.add(pro);
                disponibles.add(dis);
            }

        }

        for (j=0;j<=i;j++){
            producto.get(j);
            System.out.println(producto.get(j));
            disponibles.get(j);
            System.out.println(disponibles.get(j));
            
        }


    }

}
