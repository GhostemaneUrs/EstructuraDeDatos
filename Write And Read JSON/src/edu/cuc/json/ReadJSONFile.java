/*
 * Esta clase se usara para aprender a leer archivos JSON en java
 */
package edu.cuc.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



/**
 *
 * @author Ghostemane
 */
public class ReadJSONFile {
    public static void main(String[] args) {
         
        JSONParser parser = new  JSONParser();
        
        try {
             
            // Para leer archivos JSON en objetos
            
             Object objeto = parser.parse(new FileReader("Archivo.json"));
             JSONObject jsonObjeto = (JSONObject) objeto;
             String nombre = (String) jsonObjeto.get("Nombre");
             System.out.println("Nombre: " + nombre);
             
             String apellido = (String) jsonObjeto.get("Apellidos");
             System.out.println("Apellido: " + apellido);
             
             String nacionalidad = (String) jsonObjeto.get("Nacionalidad");
             System.out.println("Nacionalidad: " + nacionalidad);
             
             String edad = (String) jsonObjeto.get("Edad");
             System.out.println("Edad: " + edad);
             
             //Para leer archivos JSON en un Array 
            
             JSONArray listaPrueba  = (JSONArray) jsonObjeto.get("Frase del dia");
             Iterator<String> iterator = listaPrueba.iterator();
             while (iterator.hasNext()) {
                 System.out.println("Frases del dia: " + iterator.next()); 
            }
             
             
        } catch (FileNotFoundException e) {}
         catch (IOException e) {}
         catch (ParseException e) {}
         catch (Exception e) {}
    }
}
