/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;



/**
 *
 * @author LENOVO
 */
public class Automovil2 {
    private int ceduladueño;
    private String marcavehiculo;
    private int añofabricacion;
    private double valorvehiculo;
    private double valormatricula;
    private int añosantiguedadvehiculo;
    
    
    
    public Automovil2(int cd, String mv,int af,double a){
        ceduladueño = cd;
        marcavehiculo = mv;
        añofabricacion = af;
        valorvehiculo = a;
        
    }

    
    public void establecerCedulaDueño(int cd){
        ceduladueño = cd;
    }
    
    public void establecerMarcaVehiculo(String mv){
        marcavehiculo = mv;
    }
    
    public void establecerAñoFabricacion(int af){
        añofabricacion = af;
    }
    
    public void establecerValorVehiculo(double vv){
        valorvehiculo = vv;
    }
    
    public void establecerAñosAntiguedadVehiculo(){
        añosantiguedadvehiculo = 2024 - añofabricacion;
    }
    
    public void establecerValorMatricula(){
        valormatricula = 0.002 * valorvehiculo * añosantiguedadvehiculo;
    }
    
    public int obtenerCedulaDueño(){
        return ceduladueño;
    }
    
    public String obtenerMarcaVehiculo(){
        return marcavehiculo;
    }
    
    public int obtenerAñoFabricacion(){
        return añofabricacion;
    }    
    
    public double obtenerValorVehiculo(){
        return valorvehiculo;
    }
    
    public int obtenerAñosAntiguedadVehiculo(){
        añosantiguedadvehiculo = 2024 - añofabricacion;
        return añosantiguedadvehiculo;
    }
    
    public double obtenerValorMatricula(){
        valormatricula = 0.002 * valorvehiculo * añosantiguedadvehiculo;
        return valormatricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Factura del Vehiculo Comprado  \n\n"
                + "Cedula del Dueño : %d\n"
                + "Marca del Vehiculo : %s\n"
                + "Año de Fabricacion del Vehiculo : %d\n"
                + "Valor del Vehiculo : %.2f\n"
                + "Años de Antiguedad del Vehiculo : %d\n"
                + "Valor de Matricula del Vehiculo : %.2f\n",
                obtenerCedulaDueño(),
                obtenerMarcaVehiculo(),
                obtenerAñoFabricacion(),
                obtenerValorVehiculo(),
                obtenerAñosAntiguedadVehiculo(),
                obtenerValorMatricula());
        return cadena;
        
    }
    
}
