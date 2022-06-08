/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proydesa.intermedio.maza.laura.consignas;

/**
 *
 * @author Laura
 */
public class Consignas {
    /**
     * 0)
Generar una clase productos y una clase empleados

empleados 
campos -> id y nombre

productodos
campos->nombre y precio

La lista debe esta cargada con los siguiente:

Producto{nombreP=Shampo, precio=300}
Producto{nombreP=Quita Manchas, precio=250}
Producto{nombreP=queso, precio=220}
Producto{nombreP=Que sabora, precio=90}
Producto{nombreP=Lavandina, precio=280}
Producto{nombreP=Jabon, precio=150}
Producto{nombreP=Detergente, precio=90}


Empleado{id=2, nombre=Marcos}
Empleado{id=3, nombre=Jere}
Empleado{id=3, nombre=Jere}
Empleado{id=4, nombre=Jose}
Empleado{id=8, nombre=Jeronimo}
Empleado{id=7, nombre=Jaime}
Empleado{id=4, nombre=Arian}
Empleado{id=1, nombre=Fernando}


1)
MOSTRAR la lista de empleados ordenada por nombres 

cargar una lista de economicos con los productos ordendos por precio ascendente


2)
Para la lista de productos mostrar todos los que tengan un nombre  que empieze con "q" sin importar si es mayuscula o minuscula

Para la lista de empleados cargar una coleccion sin repeticiones con los empleados cuyo nombres empiezen con J 
y mostrar  la lista 

3)
Generar una lista con el nombre+ProydesaEmpleado  para todos los empleados de la lista 

Mostrar una lista de los precios con un 10% de interes sobre los mismos

4)

Ingresar por teclado el nombre de un empleado y regresar un true si se encuentra en la lista

5)
Mostrar los primeros 3 productos mas caros


RES


package test.ejercicios;

import clases.Empleado;
import clases.Producto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class testEjUno {
    
    public static void main(String[] args) {
        
        
        List<Empleado> empleados= new ArrayList<>();
        
        List<Producto> productos=new ArrayList<>();
        
        
        empleados.add(new Empleado(2,"Marcos"));
        empleados.add(new Empleado(3,"Jere"));
        empleados.add(new Empleado(3,"Jere"));
        empleados.add(new Empleado(4,"Jose"));
        empleados.add(new Empleado(8,"Jeronimo"));
        empleados.add(new Empleado(7,"Jaime"));
        empleados.add(new Empleado(4,"Arian"));
        empleados.add(new Empleado(1,"Fernando"));
        
        productos.add(new Producto("Shampo",300));
        productos.add(new Producto("Quita Manchas",250));
        productos.add(new Producto("queso",220));
        productos.add(new Producto("Que sabora",90));
        productos.add(new Producto("Lavandina",280));
        productos.add(new Producto("Jabon",150));
        productos.add(new Producto("Detergente",90));
        
        
        //casoUnoE(empleados);
        
        
        //List<Producto> resUnoP=casoUnoP(productos);
        
        //resUnoP.forEach(System.out::println);
        
        
        //casoDosP(productos);
                
        //Set<Empleado> resDosE=casoDosE(empleados);
        
        //resDosE.forEach(System.out::println);
        
        //casoTresE(empleados);
        
        //List<Integer> resTresP=casoTresP(productos);
        
        //resTresP.forEach(System.out::println);
        
          
        //casoCuatroE(empleados,"Jere");
        
        //casoCincoP(productos);
        
        
        productos.forEach(System.out::println);
        empleados.forEach(System.out::println);
        
    }
    
    
    public static void casoUnoE(List<Empleado> lista){
    
        lista.stream().sorted((Empleado o1, Empleado o2) -> o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase())).forEach(System.out::println);
    
           
        
        
    }
    
    public static List casoUnoP(List<Producto> lista){
    
    
        List<Producto> retornar=lista.stream().sorted().collect(Collectors.toList());
    
        return retornar;
    }
    
    public static void casoDosP(List<Producto> lista){
        
        lista.stream().filter(x->x.getNombreP().toLowerCase().startsWith("q")).forEach(System.out::println);
    
    }
    
    public static Set<Empleado> casoDosE(List<Empleado> lista){
        
        Set<Empleado> retornar=lista.stream().filter(x->x.getNombre().toLowerCase().startsWith("j")).collect(Collectors.toSet());
                
        return retornar;
        }
   
    public static void casoTresE(List<Empleado> empleado){
    
        empleado.stream().map(x->x.getNombre()+" ProydesaEmpleado").forEach(System.out::println);
    
    }
    
    public static List<Integer> casoTresP(List<Producto> lista){
    
        List<Integer> retorno=lista.stream().map(x->x.getPrecio()+(x.getPrecio()*10/100)).collect(Collectors.toList());
        
                return retorno;
    }
    
    public static void casoCuatroE(List<Empleado> lista,String nombre){
    
        
        boolean ban=lista.stream().anyMatch(x->x.getNombre().startsWith(nombre));
        
        if (ban) {
            
            System.out.println("Si esta persona se encuentra en la lista de empleados");
        }else{
            
            System.out.println("El mismo no se encuentra en la lista de empleados");
        }
    
    }
    
    public static void casoCincoP(List<Producto> lista){
    
        
        //List<Producto> primera=
                
        List<Producto> primera=lista.stream().sorted().collect(Collectors.toList());
        
        List<Producto> mostrar=primera.stream().limit(3).collect(Collectors.toList());
        
        mostrar.forEach(System.out::println);
    
    }
    
    
}



     */
}
