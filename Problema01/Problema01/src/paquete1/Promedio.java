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
calificación 1, 2 y 3.
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Promedio {
    private String nombreestudiante;
    private double calificacionmateria1;
    private double calificacionmateria2;
    private double calificacionmateria3;
    private double promedio;
    
    public Promedio (String n,double c1,double c2){
        nombreestudiante = n;
        calificacionmateria1 = c1;
        calificacionmateria2 = c2;
        calificacionmateria3 = (calificacionmateria2 + calificacionmateria1) / 2;
    }
    
    public Promedio (String n,double c1,double c2,double c3){
        nombreestudiante = n;
        calificacionmateria1 = c1;
        calificacionmateria2 = c2;
        calificacionmateria3 = c3;   
    }
    
    public void establecerNombreEstudiante(String n){
        nombreestudiante = n;
    }
    
    public void establecerCalificacionMateria1(double c1){
        calificacionmateria1 = c1;
    }
    
    public void establecerCalificacionMateria2(double c2){
        calificacionmateria2 = c2;
    }
    
    public void establecerCalificacionMateria3(double c3){
        calificacionmateria3 = c3;
    }
    
    public void establecerPromedio(double p){
        promedio = p;
    }
    
    public String obtenerNombreEstudiante(){
        return nombreestudiante;
    }
    
    public double obtenerCalificacionMateria1(){
        return calificacionmateria1;
    }
    
    public double obtenerCalificacionMateria2(){
        return calificacionmateria2;
    }
    
    public double obtenerCalificacionMateria3(){
        return calificacionmateria3;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Datos de Estudiante\n\n"
                    + "Nombre del Estudiante: %s\n"
                    + "Calificacion de la Materia 1 : %.2f\n"
                    + "Calificacion de la Materia 2: %.2f\n"
                    + "Calificacion de la Materia 3 : %.2f\n", 
                    obtenerNombreEstudiante(),
                    obtenerCalificacionMateria1(),
                    obtenerCalificacionMateria2(), 
                    obtenerCalificacionMateria3());
        return cadena;
    }
}
