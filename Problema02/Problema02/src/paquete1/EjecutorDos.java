/*
 Un automóvil tiene entre sus características, cédula del dueño, 
marca de vehículo, año de fabricación, valor de vehículo y valor de la matrícula.
El valor de la matricula es igual al 0.002% del valor de vehículo por 
el número de años de antigüedad del vehículo.

En una clase llamada Ejecutor, cree un ciclo repetitivo que se ejecutará 
en función de un número de iteraciones, de acuerdo a un valor ingresado 
por el usuario. Al final del ciclo se debe presentar una sola cadena 
con todos los valores de los objetos previos ingresados.

En una clase llamada EjecutorDos, cree un ciclo repetitivo que se ejecutará 
hasta que el usuario lo decida. Al final del ciclo se debe presentar 
una sola cadena con todos los valores de los objetos previos ingresados.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EjecutorDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int ceduladueño;
        String marcavehiculo;
        double valorvehiculo;
        double valormatricula;
        int añosantiguedadvehiculo;
        String opcion;
        boolean bandera;

            bandera = true;
            
            while (bandera) {
            entrada.nextLine();
            System.out.println("Ingrese La Cedula del Dueño\n");
            ceduladueño = entrada.nextInt();
            System.out.println("Ingrese La Marca del Vehiculo\n");
            marcavehiculo = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese El valor del Vehiculo\n");
            valorvehiculo = entrada.nextDouble();
            System.out.println("Ingrese El valor de la Matricula\n");
            valormatricula = entrada.nextDouble();
            System.out.println("Ingrese los Años de Antiguedad del Vehiculo\n");
            añosantiguedadvehiculo = entrada.nextInt();

            entrada.nextLine();
            Automovil Matricula2 = new Automovil();

            System.out.printf("%s \n", Matricula2);

            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + "salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }
        }

    }

}
