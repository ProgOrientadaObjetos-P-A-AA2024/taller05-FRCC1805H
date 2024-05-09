/*
 Un automóvil tiene entre sus características, cédula del dueño, 
marca de vehículo, año de fabricación, valor de vehículo y valor de la matrícula.
El valor de la matricula es igual al 0.002% del valor de vehículo por 
el número de años de antigüedad del vehículo.

En una clase llamada EjecutorDos, cree un ciclo repetitivo que se ejecutará 
en función de un número de iteraciones, de acuerdo a un valor ingresado 
por el usuario. Al final del ciclo se debe presentar una sola cadena 
con todos los valores de los objetos previos ingresados.

En una clase llamada EjecutorDos, cree un ciclo repetitivo que se ejecutará 
hasta que el usuario lo decida. Al final del ciclo se debe presentar 
una sola cadena con todos los valores de los objetos previos ingresados.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Automovil2;

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
        int añofabricacion;
        double valormatricula;
        int añosantiguedadvehiculo;
        String opcion;
        boolean bandera;

        bandera = true;
        String cadenafinal = "";

        while (bandera) {
            System.out.println("Ingrese la Cedula del Dueño\n");
            ceduladueño = entrada.nextInt();
            System.out.println("Ingrese La Marca del Vehiculo\n");
            marcavehiculo = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese El Año de Fabricacion del Vehiculo \n");
            añofabricacion = entrada.nextInt();
            System.out.println("Ingrese El Valor del Vehiculo \n");
            valorvehiculo = entrada.nextDouble();

            Automovil2 A2 = new Automovil2(ceduladueño, marcavehiculo,
                    añofabricacion, valorvehiculo);

            cadenafinal = String.format("Factura del Vehiculo Comprado  \n\n"
                    + "Cedula del Dueño : %d\n"
                    + "Marca del Vehiculo : %s\n"
                    + "Año de Fabricacion del Vehiculo : %d\n"
                    + "Valor del Vehiculo : %.2f\n"
                    + "Años de Antiguedad del Vehiculo : %d\n"
                    + "Valor de Matricula del Vehiculo : %.2f\n",
                    A2.obtenerCedulaDueño(),
                    A2.obtenerMarcaVehiculo(),
                    A2.obtenerAñoFabricacion(),
                    A2.obtenerValorVehiculo(),
                    A2.obtenerAñosAntiguedadVehiculo(),
                    A2.obtenerValorMatricula());

            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más Automoviles. Ingrese n para"
                    + " salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }
        }

        System.out.printf(" %s \n", cadenafinal);

    }

}
