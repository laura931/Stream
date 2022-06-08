/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proydesa.intermedio.maza.laura.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Laura
 */
public class IntAleatoriosSinRepeticion {
    private static List<String> listaIdProductosExistentes;
    
    public IntAleatoriosSinRepeticion(){
    }
       
    /**
     * @return the listaIdProductosExistentes
     */
    public static List<String> getListaIdProductosExistentes() {
        if(listaIdProductosExistentes.isEmpty())
            listaIdProductosExistentes = new ArrayList<String>();
        
        return listaIdProductosExistentes;
    }

    /**
     * @param aListaIdProductosExistentes the listaIdProductosExistentes to set
     */
    public static void setListaIdProductosExistentes(List<String> aListaIdProductosExistentes) {
        listaIdProductosExistentes = aListaIdProductosExistentes;
    }
    
    public static String crearIdProductos(){
        Random random = new Random();
        
        int nuevoIdInt = random.nextInt(1000000 - 1) + 1;
        String nuevoIdString = String.format("%06d", nuevoIdInt);
        
        nuevoIdString = crearIdProductosSinRepetir(nuevoIdString);
        
        return nuevoIdString;
    }
    
    public static String crearIdProductosSinRepetir(String id){
        Random random = new Random();
        
        int nuevoIdInt;
        String nuevoIdString;
        
        if (listaIdProductosExistentes.contains(id)){
            nuevoIdInt = random.nextInt(1000000 - 1) + 1;
            nuevoIdString = String.format("%06d", nuevoIdInt);
            
            crearIdProductosSinRepetir(nuevoIdString);
        }
        else {
            nuevoIdString = id;
        }
        
        return nuevoIdString;
    }
}
