/*
 * Esta clase se va usar para aprender el metodo de crear archivos JSON en java
 */
package edu.cuc.json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Ghostemane
 */
public class CreateJSONFile {
    public static void main (String [] args){
        JSONObject objeto = new JSONObject();        //Se puede crear por objeto, via clave y ingreso
        
        objeto.put("Nombre",  "Andrés Felipe");
        objeto.put("Apellidos",  "Jaramillo Gonzalez");
        objeto.put("Nacionalidad",  "Colombia");
        objeto.put("Edad",  "19 años");
        
        
        JSONArray lista = new JSONArray();   //Se puede crear por lista
        
        lista.add("Tu mama es mia");
        lista.add("El que madruga Dios lo ayuda, pero el que no duerme se come el desayuno del que madruga");
        lista.add("El mejor mix que tengo https://www.youtube.com/watch?v=4iJJCaSyoSw&start_radio=1&list=RDMM4iJJCaSyoSw");
        
        objeto.put("Frase del dia", lista);
        
        try (FileWriter archivo = new FileWriter("Archivo.json"))  //Usamos un try, catch para evitar error al guardar el archivo
        {
              archivo.write(objeto.toString()); // El archivo que creamos le pasamo los objetos que realizamos convirtiendolos en un toString 
              archivo.flush();                             // para poder visualizarlo
        } catch (IOException e ) {
        }
        System.out.println(objeto);
    }
}
