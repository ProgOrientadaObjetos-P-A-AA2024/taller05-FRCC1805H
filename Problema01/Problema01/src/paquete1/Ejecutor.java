/*
 Se requiere representar una entidad que permita crear objetos
con características como: nombre de estudiante, calificación de materia 1,
calificación de materia 2, calificación de materia 3 y promedio de calificaciones.
En una clase llamada Ejecutor, se debe presentar un menú. 
Si el usuario ingresa el número 1, podrá crear un objeto de tipo Estudiante 
donde se use un constructor que espere parámetros para: nombre, 
calificación de materia 1 y calificación de materia 2; la materia 3, 
será igual al promedio de la calificación 1 y calificación 2. 
Si el usuario ingresa el número 2, podrá crear un objeto donde 
se debe usar un constructor que espere como parámetros nombre, 
calificación 1, 2 y 3
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombreestudiante = null;
        double calificacionmateria1 = 0;
        double calificacionmateria2 = 0;
        double calificacionmateria3;
        double promedio;
        String opcion;

        System.out.print("Ingrese numero 1 o numero 2 \n");
        opcion = entrada.nextLine();
        if (opcion.equals("1")) {


            System.out.println("Ingrese el Nombre del Estudiante");
            nombreestudiante = entrada.nextLine();
            System.out.println("Ingrese la Calificacion Materia 1");
            calificacionmateria1 = entrada.nextDouble();
            System.out.println("Ingrese la Calificacion Materia 2");
            calificacionmateria2 = entrada.nextDouble();

            
            Promedio Estudiante1 = new Promedio(nombreestudiante, 
                    calificacionmateria1,calificacionmateria2);
            System.out.printf(" %s \n ", Estudiante1);
            entrada.nextLine();
        }else{
            if (opcion.equals("2")) {
                
                 System.out.println("Ingrese el Nombre del Estudiante");
                 nombreestudiante = entrada.nextLine();
                System.out.println("Ingrese la Calificacion Materia 1");
                calificacionmateria1 = entrada.nextDouble();
                System.out.println("Ingrese la Calificacion Materia 2");
                calificacionmateria2 = entrada.nextDouble();
                System.out.println("Ingrese la Calificacion Materia 3");
                calificacionmateria3 = entrada.nextDouble();

                Promedio Estudiante2 = new Promedio(nombreestudiante,
                        calificacionmateria1, calificacionmateria2,
                        calificacionmateria3);
                System.out.printf(" %s \n ", Estudiante2);
            } else {
            }
        }

    }

}
