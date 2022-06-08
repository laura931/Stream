/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proydesa.intermedio.maza.laura.tests;


import java.util.ArrayList;
import java.util.List;
import proydesa.intermedio.maza.laura.clases.Empleado;
import proydesa.intermedio.maza.laura.clases.Producto;

/**
 *
 * @author Laura
 */
public class Test1 {
    public static void main(String[] args) {
        // Inicializamos las listas
        List<Empleado> listaEmpleados = new ArrayList<>();
        List<Producto> listaProductos = new ArrayList<>();
    
        //carga de empleados
        listaEmpleados.add(new Empleado(2,"Marcos"));
        listaEmpleados.add(new Empleado(3,"Jere"));
        listaEmpleados.add(new Empleado(3,"Jere"));
        listaEmpleados.add(new Empleado(4,"Jose"));
        listaEmpleados.add(new Empleado(8,"Jeronimo"));
        listaEmpleados.add(new Empleado(7,"Jaime"));
        listaEmpleados.add(new Empleado(4,"Arian"));
        listaEmpleados.add(new Empleado(1,"Fernando"));
          
        // carga de productos
        listaProductos.add(new Producto("Shampo", 300));
        listaProductos.add(new Producto("Quita Manchas", 250));
        listaProductos.add(new Producto("queso", 220));
        listaProductos.add(new Producto("Que sabora", 90));
        listaProductos.add(new Producto("Lavandina", 280));
        listaProductos.add(new Producto("Jabon", 150));
        listaProductos.add(new Producto("Detergente", 90));
        
        ordenarEmpleadosPorNombreYMostrar(listaEmpleados);
        
    }
    
    public static void ordenarEmpleadosPorNombreYMostrar(List<Empleado> listaEmpleados){
        System.out.println("Lista de empleados ordenada por nombres: ");
        System.out.println("------------------------------------------------------------------------------");
        listaEmpleados.stream().sorted( (Empleado e1, Empleado e2) -> e1.getNombre().compareToIgnoreCase(e2.getNombre())).forEach(System.out :: println);
    }
    
}
