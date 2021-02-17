package edu.escuelaing.arem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Cache{

    private static HashMap<String,Object> datos = new HashMap<String,Object>();

    
    public static void Guardar(String clave, Object objeto) {
    	datos.put(clave, objeto);
    }
    
    public static Object Sacar(String clave) {
    	return datos.get(clave);
    }
    
    public static boolean ValidarExistencia(String clave) {
    	Object dato =datos.get(clave);
    	return dato!=null;
    }
}
